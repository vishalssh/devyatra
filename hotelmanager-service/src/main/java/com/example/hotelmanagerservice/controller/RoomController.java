package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class RoomController {

    @Autowired
    private HotelManagerService hotelManagerService;

}
