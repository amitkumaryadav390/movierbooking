package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat extends  BaseModel{
    private int seatNumber;
    @ManyToOne
    private SeatType seatType;
    //private SeatStatus seatStatus;
    private int rowNum;
    private int columnNum;
}
