package com.vbs.demo.controller;

import com.vbs.demo.models.User;
import com.vbs.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @PostMapping("/register")
    public String register(@RequestBody User user)
    {
        userRepo.save(user);
        return "Signup Successful";
    }
}

