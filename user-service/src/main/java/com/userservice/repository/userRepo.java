package com.userservice.repository;

import com.userservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Users, String> {
}
