package com.bookingservice.services;

import com.bookingservice.model.Booking;

import java.util.List;

public interface BookingService {

    public String createBooking(Booking booking);

    public Booking getBookingById(String bookingId);

    public List<Booking> getAllBookings();

    public List<Booking> getBookingByUserId(String userId);

    public Booking getHotel(String hotelId);
}
