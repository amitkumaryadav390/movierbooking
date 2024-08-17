package com.amit.bookmyshow.repo;

import com.amit.bookmyshow.model.ShowSeat;
import com.amit.bookmyshow.model.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepo extends JpaRepository<ShowSeat, Integer> {
   // public List<ShowSeatType> findShowSeatB
}
