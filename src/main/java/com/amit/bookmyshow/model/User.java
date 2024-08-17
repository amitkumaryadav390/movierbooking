package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User extends  BaseModel{
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;

    @OneToMany
    private List<Booking> bookings;

}
