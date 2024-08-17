package com.amit.bookmyshow.repo;

import com.amit.bookmyshow.model.Show;
import com.amit.bookmyshow.model.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepo extends JpaRepository<ShowSeatType, Integer> {
    public List<ShowSeatType> findByShow(Show show);
}
