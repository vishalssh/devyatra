package com.example.hotelservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    private String roomType;
    private int numOfBed;
    private boolean available;
    private double price;
    private int hotelId;
}
