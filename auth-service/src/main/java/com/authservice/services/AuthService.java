package com.authservice.services;

import com.authservice.dto.RegisterRequest;
import com.authservice.model.UserAuth;
import com.authservice.repository.UserAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserAuthRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {

        UserAuth user = new UserAuth();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        // default role
        if (request.getRole() == null) {
            user.setRole("ROLE_USER");
        } else {
            user.setRole("ROLE_" + request.getRole().toUpperCase());
        }

        repo.save(user);

        return "User Registered";
    }
}
