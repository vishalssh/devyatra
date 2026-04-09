package com.example.hotelservice.controller;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelservice;

    @PostMapping("/registerHotel")
    public Hotel register(@RequestBody Hotel hotel){
        return hotelservice.register(hotel);
    }

    @GetMapping("/getHotelById/{hotelId}")
    public Hotel getHotelById(@PathVariable int hotelId){
        return hotelservice.getHotelById(hotelId);
    }

    @GetMapping("/getAllHotels")
    public List<Hotel> getHotels(){
        return hotelservice.getAllHotels();
    }

    @GetMapping("/location/{location}")
    public List<Hotel> getByHotelLocation(@PathVariable String location){
        return hotelservice.getHotelByLocation(location);
    }

    @DeleteMapping("/{hotelId}")
    public String deleteHotel(@PathVariable int hotelId){
        return hotelservice.deleteHotel(hotelId);
    }

    @PutMapping("/updateHotel/{hotelId}")
    public Hotel updateHotel(@PathVariable int hotelId,@RequestBody Hotel hotel){
        hotel.setHotelId(hotelId);
        return hotelservice.updateHotel(hotel);
    }

    // API - HOTELS
}
