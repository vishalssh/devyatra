package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.model.Hotel;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class HotelController {

    @Autowired
    private HotelManagerService hotelManagerService;

    @PostMapping("/createHotel")
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelManagerService.createHotel(hotel);
    }

    @GetMapping("/seehotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        return hotelManagerService.getHotel(id);
    }


}
