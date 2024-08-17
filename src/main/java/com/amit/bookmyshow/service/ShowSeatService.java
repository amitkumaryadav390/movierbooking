package com.amit.bookmyshow.service;

import com.amit.bookmyshow.model.ShowSeat;
import com.amit.bookmyshow.repo.ShowSeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSeatService {
    @Autowired
    ShowSeatRepo showSeatRepo;

    public List<ShowSeat> findShowSeats(List<Integer> showSeatIds){
        return showSeatRepo.findAllById(showSeatIds);
    }
    public List<ShowSeat> saveShowSeats(List<ShowSeat> showSeats){
        return showSeatRepo.saveAll(showSeats);
    }
}
