package com.userservice.DAO;

import com.userservice.model.Booking;
import com.userservice.model.Users;
import com.userservice.repository.userRepo;
import com.userservice.services.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class userDao implements userService {

    @Autowired
    userRepo ur;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Users saveUser(Users users) {

        if(users.getRole()==null)
        {
            users.setRole("User");
        }
        if(users.getUserStatus()==null)
        {
            users.setUserStatus("pending");
        }
        ur.save(users);
        return users;
    }

    @Override
    public Users getUser(String userId) {
        return ur.findById(userId).orElse(null);
    }

    @Override
    public List<Users> getAllUsers() {
        return ur.findAll();
    }

    @Override
    public void deleteUserById(String userId) {
        Users users = ur.findById(userId).orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
        users.setUserStatus("inactive");
        ur.save(users);
    }

    @Override
    public Users getUserBookingById(String userId) {
        String url = "http://localhost:8081/booking/getBooking/" + userId;

        ArrayList arrayList = restTemplate.getForObject(url, ArrayList.class);

        Users ur1 = ur.findById(userId).orElse(null);
        if (ur1 != null) {
            ur1.setBookings(arrayList);
        }

        return ur1;
    }

    @Override
    public Users getUserHotelBookingById(String hotelId) {
        return null;
    }
}
