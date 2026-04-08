package com.example.hotelmanagerservice.service;

import com.example.hotelmanagerservice.model.HotelManager;
import java.util.List;

public interface HotelManagerService {
    HotelManager save(HotelManager manager);
    List<HotelManager> getallmanagers();
    HotelManager getManagerById(int id);
    void deleteManagerById(int id);
    HotelManager updateManager(int id,HotelManager manager);
}