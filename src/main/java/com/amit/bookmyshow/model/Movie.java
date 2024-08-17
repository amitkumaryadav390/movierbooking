package com.amit.bookmyshow.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie extends  BaseModel{
    private String title;
    private String year;
    private String director;
    private String genre;
    private String rating;
    @ElementCollection
    private List<String> actors;


}
