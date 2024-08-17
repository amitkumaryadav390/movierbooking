package com.amit.bookmyshow.dto;

import com.amit.bookmyshow.model.Status;
import com.amit.bookmyshow.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class LoginResponseDto {
    private User user;
    private Status status;
    private String message;
}
