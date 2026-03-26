package com.bookingservice.dao;

import com.bookingservice.model.Booking;
import com.bookingservice.repository.BookingRepo;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDao implements BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public void createBooking(Booking booking) {
        bookingRepo.save(booking);
    }
}
