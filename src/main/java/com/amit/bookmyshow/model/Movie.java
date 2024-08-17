package com.amit.bookmyshow.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Movie extends  BaseModel{
    private String title;
    private String year;
    private String director;
    private String genre;
    private String rating;
    @ElementCollection
    private List<String> actors;


}
