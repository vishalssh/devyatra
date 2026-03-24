package com.userservice.controller;

import com.userservice.model.Users;
import com.userservice.repository.userRepo;
import com.userservice.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    userService us;

    @PostMapping("/register")
    public String userRegister(@RequestBody Users users) {
        us.saveUser(users);
        return "User registered successfully: ";
    }

    @GetMapping("/getUser/{userId}")
    public String getUser(@PathVariable String userId) {
        return us.getUser(userId);
    }

    @GetMapping("/getAllUsers")
    public List<Users> getAllUsers() {
        return us.getAllUsers();
    }

    @PostMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId) {
        us.deleteUserById(userId);
        return "User deleted";
    }
}
