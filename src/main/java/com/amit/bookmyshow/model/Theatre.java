package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Theatre extends  BaseModel{
    private String theatreName;
    @ManyToOne
    private Region region;
    private String theatreAddress;

}
