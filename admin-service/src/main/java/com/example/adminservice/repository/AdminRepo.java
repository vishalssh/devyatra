package com.example.adminservice.repository;

import com.example.adminservice.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

   // public Users findByUserId(String uid);
}
