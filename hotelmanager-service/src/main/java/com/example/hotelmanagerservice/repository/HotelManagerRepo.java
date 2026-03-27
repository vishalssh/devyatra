package com.example.hotelmanagerservice.repository;

import com.example.hotelmanagerservice.model.Hotelmanager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelManagerRepo extends JpaRepository<Hotelmanager,Integer> {

}
