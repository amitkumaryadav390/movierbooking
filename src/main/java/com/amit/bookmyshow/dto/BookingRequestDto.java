package com.amit.bookmyshow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class BookingRequestDto {
    private int userId;
    private int showId;
    private List<Integer> showSeatId;
}
