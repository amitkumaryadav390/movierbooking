package com.amit.bookmyshow.controller;

import com.amit.bookmyshow.dto.BookingRequestDto;
import com.amit.bookmyshow.dto.BookingResponseDto;
import com.amit.bookmyshow.model.Booking;
import com.amit.bookmyshow.model.BookingStatus;
import com.amit.bookmyshow.model.Status;
import com.amit.bookmyshow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingResponseDto bookShow(BookingRequestDto bookingRequestDto) {
        BookingResponseDto bookingResponseDto = new BookingResponseDto();
        try{
            Booking booking = bookingService.bookShow(
                    bookingRequestDto.getShowId(),
                    bookingRequestDto.getUserId(),
                    bookingRequestDto.getShowSeatId()
            );

            bookingResponseDto.setBookingId(booking.getId());
            bookingResponseDto.setResponseMsg("Booking is successful");
            bookingResponseDto.setAmount(booking.getBookingAmount());
            bookingResponseDto.setStatus(Status.SUCCESS);

        } catch (Exception e) {
            bookingResponseDto.setResponseMsg(e.getMessage());
            bookingResponseDto.setStatus(Status.FAILURE);

        }
        return bookingResponseDto;
    }

}
