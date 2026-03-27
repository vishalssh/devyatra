package com.bookingservice.controller;


import com.bookingservice.model.Booking;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAllBooking")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/getBooking/{uid}")
    public String getBooking(@PathVariable String uid) {
        return bookingService.getBookingById(uid) ;
    }


}
