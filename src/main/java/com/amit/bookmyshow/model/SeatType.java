package com.amit.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SeatType extends BaseModel{
    @EqualsAndHashCode.Include
    private String name;

}
