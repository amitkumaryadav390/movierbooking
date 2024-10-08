package com.amit.bookmyshow.dto;

import com.amit.bookmyshow.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignupResponseDTO {
    private String userEmail;
    private String message;
    private Status status;
}
