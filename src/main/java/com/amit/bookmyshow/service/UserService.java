package com.amit.bookmyshow.service;

import com.amit.bookmyshow.model.User;
import com.amit.bookmyshow.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;


    public User signUp(String name, String email, String password, String address,String phone) {
        Optional<User> user = userRepo.findByEmail(email);
        if (user.isPresent()) {
            throw new RuntimeException("User already exists");
        }else{
            User newUser = new User();
            newUser.setEmail(email);
            newUser.setName(name);
            newUser.setPassword(password);
            newUser.setAddress(address);
            newUser.setPhone(phone);
            return userRepo.save(newUser);
        }
    }
    public User login(String email, String password) {
        Optional<User> user = userRepo.findByEmailAndPassword(email,password);
        if (user.isPresent()) {
            return user.get();
        }
        else{
            throw new RuntimeException("Wrong email or password");
        }
    }
}
