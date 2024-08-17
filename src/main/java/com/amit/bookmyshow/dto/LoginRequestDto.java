package com.amit.bookmyshow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class LoginRequestDto {
    String username;
    String password;
}
