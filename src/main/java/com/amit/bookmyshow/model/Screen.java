package com.amit.bookmyshow.model;

import jakarta.persistence.*;
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
