package com.example.hotelservice.service;

import com.example.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService  {
    public Hotel register(Hotel hotel);

    public Hotel getHotelById(int hotelId);
    public List<Hotel> getAllHotels();

    public List<Hotel> getHotelByLocation(String location);

    public String deleteHotel(int hotelId);

    public Hotel updateHotel(Hotel hotel);
}
