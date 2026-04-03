package com.bookingservice.dto;

import lombok.Data;

@Data
public class RoomDto {
    private int roomId;
    private int hotelId;
    private String roomType;
    private int numOfBed;
    private boolean available;
    private double price;
}
