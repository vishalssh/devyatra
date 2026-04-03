package com.userservice.controller;

import com.userservice.model.Users;
import com.userservice.repository.userRepo;
import com.userservice.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    userService us;

    @PostMapping("/register")
    public Users userRegister(@RequestBody Users users) {
        users.setUserId(UUID.randomUUID().toString());
        return us.saveUser(users);
    }

    @GetMapping("/getUser/{userId}")
    public Users getUser(@PathVariable String userId) {
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

    @GetMapping("/getUserBooking/{userId}")
    public Users getUserBooking(@PathVariable String userId) {
        return us.getUserBookingById(userId);
    }

    @GetMapping("/getUserHotelBooking/{hotelId}")
    public Users getUserHotelBooking(@PathVariable String hotelId) {
        return us.getUserHotelBookingById(hotelId);
    }
}
