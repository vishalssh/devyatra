package com.bookingservice.controller;


import com.bookingservice.model.Booking;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/saveBooking")
    public String createBooking(@RequestBody Booking booking) {
        booking.setBookingId(UUID.randomUUID().toString());
        return bookingService.createBooking(booking);
    }

    @GetMapping("/getAllBooking")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }


    @GetMapping("/getBookingById/{bookingId}")
    public Booking getBookingById(@PathVariable String bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    @GetMapping("/getBooking/{userId}")
    public List<Booking> getBooking(@PathVariable String userId) {
        return bookingService.getBookingByUserId(userId);
    }


}
