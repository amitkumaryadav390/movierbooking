package com.amit.bookmyshow.repo;

import com.amit.bookmyshow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowRepo extends JpaRepository<Show, Integer>{
}
