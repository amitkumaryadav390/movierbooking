package com.amit.bookmyshow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends  BaseModel{
    @Enumerated(value = EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    private Booking booking;

    @Enumerated(value = EnumType.STRING)
    private PaymentGateWay paymentGateWay;

    private double amount;

    private Date paymentDate;
    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;
}
