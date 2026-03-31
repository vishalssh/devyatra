package com.userservice.services;


import com.userservice.model.Users;

import java.util.List;

public interface userService {
    public Users saveUser(Users users);

    public Users getUser(String userId);

    public List<Users> getAllUsers();

    public void deleteUserById(String userId);

    public Users getUserBookingById(String userId);
}
