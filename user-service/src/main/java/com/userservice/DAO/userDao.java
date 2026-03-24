package com.userservice.DAO;

import com.userservice.model.Users;
import com.userservice.repository.userRepo;
import com.userservice.services.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userDao implements userService {

    @Autowired
    userRepo ur;

    @Override
    public void saveUser(Users users) {
        ur.save(users);
    }

    @Override
    public String getUser(String userId) {
        Users users = ur.findById(userId).orElse(null);
        if (users != null) {
            return "User ID: " + users.getUserId() + "\n" +
                    "First Name: " + users.getFirstName() + "\n" +
                    "Last Name: " + users.getLastName() + "\n" +
                    "Email: " + users.getUserEmail() + "\n" +
                    "Contact: " + users.getContact() + "\n" +
                    "Gender: " + users.getGender() + "\n" +
                    "Age: " + users.getAge() + "\n" +
                    "Address: " + users.getUserAddress() + "\n" +
                    "Role: " + users.getRole() + "\n" +
                    "Status: " + users.getUserStatus();
        }   else {
            return "User not found with ID: " + userId;
        }
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
}
