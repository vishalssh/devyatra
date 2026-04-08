package com.example.hotelmanagerservice.model;

import lombok.Data;

@Data
public class Room {
    private int roomId;
    private String roomType;
    private int numOfBed;
    private boolean available;
    private double price;
    private int hotelId;
}
