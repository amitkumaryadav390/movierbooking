package com.amit.bookmyshow.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@AllArgsConstructor
public abstract class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date updatedAt;
}
