package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name = "shows")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Show extends  BaseModel{
    private String showName;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    private Date startTime;
    private Date endTime;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;
    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatTypes;


}
