package com.amit.bookmyshow.controller;

import com.amit.bookmyshow.dto.LoginRequestDto;
import com.amit.bookmyshow.dto.LoginResponseDto;
import com.amit.bookmyshow.dto.SignupRequestDTO;
import com.amit.bookmyshow.dto.SignupResponseDTO;
import com.amit.bookmyshow.model.Status;
import com.amit.bookmyshow.model.User;
import com.amit.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public SignupResponseDTO signup(SignupRequestDTO signupRequestDTO) {
        try{
            User user = userService.signUp(signupRequestDTO.getName(),
                    signupRequestDTO.getEmail(),
                    signupRequestDTO.getPassword(),
                    signupRequestDTO.getAddress(),
                    signupRequestDTO.getPhone()
            );
            return new SignupResponseDTO(user.getEmail(), "Signup is successful", Status.SUCCESS);

        }catch (Exception e){
            return new SignupResponseDTO(signupRequestDTO.getEmail(), "Signup is failed due to "+e.getMessage(), Status.FAILURE);
        }

    }
    public LoginResponseDto login(LoginRequestDto loginRequestDto){
        try{
            User user = userService.login(loginRequestDto.getUsername(),loginRequestDto.getPassword());
            return new LoginResponseDto(user,Status.SUCCESS,"Login is successful");

        }catch (Exception e){
            return new LoginResponseDto(null,Status.FAILURE,"Login is failed because "+e.getMessage());
        }
    }
}
