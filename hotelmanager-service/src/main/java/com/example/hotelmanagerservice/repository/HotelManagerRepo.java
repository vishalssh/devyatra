package com.example.hotelmanagerservice.repository;

import com.example.hotelmanagerservice.model.HotelManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelManagerRepo extends JpaRepository<HotelManager,Integer> {

}
