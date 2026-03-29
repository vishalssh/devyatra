package com.userservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", contact='" + contact + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", role='" + role + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}
