package com.example.hotelmanagerservice.service;

import com.example.hotelmanagerservice.model.Hotel;
import com.example.hotelmanagerservice.model.HotelManager;
import com.example.hotelmanagerservice.model.Room;

import java.util.List;

public interface HotelManagerService {
    HotelManager save(HotelManager manager);
    List<HotelManager> getallmanagers();
    HotelManager getManagerById(int id);
    void deleteManagerById(int id);
    HotelManager updateManager(int id,HotelManager manager);

    // Hotel service
    public Hotel getHotel(int id);
    public Hotel createHotel(Hotel hotel);

    // room service
    Room addRoom(Room room);

    Room getRoomById(int roomId);

    List<Room> getAllRooms();
}