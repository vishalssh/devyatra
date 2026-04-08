package com.example.hotelmanagerservice.model;

import lombok.Data;

@Data
public class Hotel {
    private int hotelId;
    private String hotelName;
    private String hotelLocation;
    private String hotelDescription;
    private int managerId;
}
