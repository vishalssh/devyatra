package com.bookingservice.dao;

import com.bookingservice.model.Booking;
import com.bookingservice.repository.BookingRepo;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingDao implements BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public String createBooking(Booking booking) {
        bookingRepo.save(booking);
        return null;
    }

    @Override
    public Booking getBookingById(String bookingId) {
        return bookingRepo.findById(bookingId).orElse(null);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    @Override
    public List<Booking> getBookingByUserId(String userId) {
        return bookingRepo.findByUserId(userId);
    }


}
