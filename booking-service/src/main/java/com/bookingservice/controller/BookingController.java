package com.bookingservice.controller;


import com.bookingservice.model.Booking;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/saveBooking")
    public String createBooking(@RequestBody Booking booking) {
        bookingService.createBooking(booking);
        return "Booking created successfully!";
    }


}
