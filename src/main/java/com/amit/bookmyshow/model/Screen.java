package com.amit.bookmyshow.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Screen extends  BaseModel{
    private String screenName;

    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    private List<Seat> seats;

}
