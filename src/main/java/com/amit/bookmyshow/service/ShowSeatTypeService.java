package com.amit.bookmyshow.service;

import com.amit.bookmyshow.model.SeatType;
import com.amit.bookmyshow.model.Show;
import com.amit.bookmyshow.model.ShowSeatType;
import com.amit.bookmyshow.repo.ShowSeatRepo;
import com.amit.bookmyshow.repo.ShowSeatTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShowSeatTypeService {
    @Autowired
    ShowSeatTypeRepo showSeatRepo;


    public List<ShowSeatType> getAllShowSeatTypesByShow(Show show) {
        return showSeatRepo.findByShow(show);

    }
}
