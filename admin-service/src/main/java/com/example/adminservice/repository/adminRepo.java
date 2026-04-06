package com.example.adminservice.repository;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface adminRepo extends JpaRepository<Admin, Integer> {

   // public Users findByUserId(String uid);
}
