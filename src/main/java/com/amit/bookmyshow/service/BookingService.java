package com.amit.bookmyshow.service;

import com.amit.bookmyshow.model.*;
import com.amit.bookmyshow.repo.BookingRepo;
import com.amit.bookmyshow.repo.ShowSeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired
    private UserService userService;

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ShowService showService;

    @Autowired
    ShowSeatService showSeatService;
    @Autowired
    private ShowSeatRepo showSeatRepo;

    @Autowired
    private ShowSeatTypeService showSeatTypeService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookShow(int showId, int userId, List<Integer> showSeatIds) {
        // check if user exists or not
        Optional<User> user = userService.findById(userId);
        if(user.isEmpty()){
            throw new RuntimeException("User not found");
        }
        // check if show exists or not
        Optional<Show> show = showService.getShow(showId);
        if(show.isEmpty()){
            throw new RuntimeException("Show not found");
        }

        // get seats of show
        List<ShowSeat> showSeats = showSeatRepo.findAllById(showSeatIds);
        long countAvailableSeats = showSeats
                .stream()
                .filter(showSeat -> showSeat.getStatus().equals(SeatStatus.AVAILABLE))
                .count();
        if(countAvailableSeats < showSeats.size()){
            throw new RuntimeException("Some Seats not available");
        }

        // update seats to blocked
        for(ShowSeat showSeat : showSeats){
            showSeat.setStatus(SeatStatus.BLOCKED);
        }
        showSeatService.saveShowSeats(showSeats);
        // calculate amount
        int amount = 0;
        List<ShowSeatType> showSeatTypes = showSeatTypeService.getAllShowSeatTypesByShow(show.get());
        Map<SeatType,Double> map = showSeatTypes.stream().collect(Collectors.toMap(ShowSeatType::getSeatType, ShowSeatType::getPrice));
        for(ShowSeat showSeat : showSeats){
            SeatType seatType = showSeat.getSeat().getSeatType();
            amount += map.get(seatType);
        }

        Booking booking = new Booking();
        booking.setUser(user.get());
        booking.setBookingAmount(amount);
        booking.setSeats(showSeats);
        booking.setStatus(BookingStatus.PENDING);
        bookingRepo.save(booking);

        return booking;
    }
}
