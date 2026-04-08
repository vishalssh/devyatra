package com.example.hotelmanagerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HotelManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerId;
    private String managerName;
    private String managerEmail;
    private String managerPassword;
    private String managerContact;

}
