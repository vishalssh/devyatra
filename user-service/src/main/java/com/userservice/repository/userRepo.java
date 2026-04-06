package com.userservice.repository;

import com.userservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface userRepo extends JpaRepository<Users, String> {

    String getUsersByUserId(String userId);
}
