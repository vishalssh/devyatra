package com.example.hotelservice.repository;

import com.example.hotelservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepo extends JpaRepository<Hotel,Integer> {

    List<Hotel> findByHotelLocation(String location);
    
}
