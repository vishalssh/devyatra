package com.example.hotelmanagerservice.service;

import com.example.hotelmanagerservice.model.Hotelmanager;
import java.util.List;

public interface HotelManagerService {
    Hotelmanager save(Hotelmanager manager);
    List<Hotelmanager> getallmanagers();
}
