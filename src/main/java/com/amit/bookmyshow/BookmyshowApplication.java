package com.amit.bookmyshow;

import com.amit.bookmyshow.controller.UserController;
import com.amit.bookmyshow.dto.LoginRequestDto;
import com.amit.bookmyshow.dto.LoginResponseDto;
import com.amit.bookmyshow.dto.SignupRequestDTO;
import com.amit.bookmyshow.dto.SignupResponseDTO;
import com.amit.bookmyshow.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BookmyshowApplication implements CommandLineRunner {
	@Autowired
	UserController userController;

	public void run(String... args) throws Exception {
		SignupRequestDTO signupRequestDTO = new SignupRequestDTO();
		signupRequestDTO.setAddress("Begusarai");
		signupRequestDTO.setEmail("noida2@gmail.com");
		signupRequestDTO.setPassword("123456");
		signupRequestDTO.setPhone("9304567892");
		signupRequestDTO.setName("Smriti");
		SignupResponseDTO response = userController.signup( signupRequestDTO );
		System.out.println(response.getStatus() +" "+response.getMessage());

		LoginRequestDto loginRequestDto = new LoginRequestDto("noida2@gmail.com", "12346");
		LoginResponseDto loginResponseDto = userController.login(loginRequestDto);
		System.out.println(loginResponseDto);

	}

	public static void main(String[] args) {

		System.out.println("BookmysssshowApplication");
		SpringApplication.run(BookmyshowApplication.class, args);
//		System.out.println("enter number");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		scanner.close();
//		System.out.println(number);
	}

}
