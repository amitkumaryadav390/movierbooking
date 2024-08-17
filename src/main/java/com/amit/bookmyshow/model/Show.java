package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.List;

@Entity(name = "shows")
public class Show extends  BaseModel{
    private String showName;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    private Date startTime;
    private Date endTime;

    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;


}
