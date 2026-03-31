package com.example.adminservice.controller;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import com.example.adminservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/admin")
public class AdminController {

        @Autowired
        AdminService as;

        @PostMapping("/saveAdmin")
        public Admin saveAdmin(@RequestBody Admin admin) {
            admin.setAdminId(UUID.randomUUID().toString());
            return as.saveAdmin(admin);
        }

        @GetMapping("/getAllUsers")
        public List<Users> getAllUsers() {
            return as.getAllUsers();
        }

        @GetMapping("/getUserData/{userId}")
        public Users getUserById(@PathVariable String userId) {
            return as.getUserById(userId);
        }



}
