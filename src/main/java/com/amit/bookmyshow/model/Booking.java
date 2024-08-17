package com.amit.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends  BaseModel{

    @ManyToMany
    private List<ShowSeat> seats;
    @ManyToOne
    private User user;
    private int bookingAmount;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;
    @Enumerated(value=EnumType.STRING)
    private BookingStatus status;
}
