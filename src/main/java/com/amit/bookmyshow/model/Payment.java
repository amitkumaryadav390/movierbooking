package com.amit.bookmyshow.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
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
