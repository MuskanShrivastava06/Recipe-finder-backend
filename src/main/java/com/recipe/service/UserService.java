package com.recipe.service;

import com.recipe.model.User;
import com.recipe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {

        User existingUser =
                userRepository.findByEmail(user.getEmail());

        if (existingUser != null) {
            return "Email already registered";
        }

        userRepository.save(user);

        return "User registered successfully";
    }

    public String loginUser(User user) {

        User existingUser =
                userRepository.findByEmail(user.getEmail());

        if (existingUser == null) {
            return "User not found";
        }

        if (!existingUser.getPassword()
                .equals(user.getPassword())) {

            return "Invalid password";
        }

        return "Login successful";
    }
}