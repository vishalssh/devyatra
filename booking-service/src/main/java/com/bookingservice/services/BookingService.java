package com.bookingservice.services;

import com.bookingservice.model.Booking;

import java.util.List;

public interface BookingService {

    public void createBooking(Booking booking);

    public List<Booking> getAllBookings();

    public String getBookingById(String uid);
}
