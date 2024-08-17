package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    //private Seat seat;
    @ManyToOne
    private SeatType seatType;
    private Double price;
}
