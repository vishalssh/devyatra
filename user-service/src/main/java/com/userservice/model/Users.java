package com.userservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Users {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String contact;
    private String gender;
    private String age;
    private String userAddress;
    private String role;
    private String userPass;
    private String userStatus;
    @Transient
    private List<Booking> bookings = new ArrayList<>();

}
