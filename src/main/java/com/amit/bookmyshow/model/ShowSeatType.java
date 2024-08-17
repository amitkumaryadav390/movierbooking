package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    //private Seat seat;
    @ManyToOne
    private SeatType seatType;
    private Double price;
}
