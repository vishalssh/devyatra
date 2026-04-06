package com.example.adminservice.services;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;

import java.util.List;

public interface adminService {

   public List<Users> getallusers();

   public Users getsingleuser(String userId);
}
