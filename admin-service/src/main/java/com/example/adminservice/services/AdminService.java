package com.example.adminservice.services;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;

import java.util.List;

public interface AdminService {

   public Admin saveAdmin(Admin admin);

   public List<Users> getAllUsers();

   public Users getUserById(String userId);


}
