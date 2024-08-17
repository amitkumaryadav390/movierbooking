package com.amit.bookmyshow.dto;

import com.amit.bookmyshow.model.Booking;
import com.amit.bookmyshow.model.BookingStatus;
import com.amit.bookmyshow.model.Status;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class BookingResponseDto {
    private int bookingId;
    private Status status;
    private String responseMsg;
    private double amount;
}
