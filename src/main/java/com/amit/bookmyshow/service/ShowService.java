package com.amit.bookmyshow.service;

import com.amit.bookmyshow.model.Show;
import com.amit.bookmyshow.repo.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShowService {
    @Autowired
    ShowRepo showRepo;

    public Optional<Show> getShow(int id) {
        return showRepo.findById(id);
    }

}
