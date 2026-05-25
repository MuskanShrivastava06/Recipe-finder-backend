package com.recipe.controller;

import com.recipe.model.User;
import com.recipe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(
            @RequestBody User user) {

        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestBody User user) {

        return userService.loginUser(user);
    }
}