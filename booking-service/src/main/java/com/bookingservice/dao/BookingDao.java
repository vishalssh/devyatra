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
    public void createBooking(Booking booking) {
        bookingRepo.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    @Override
    public String getBookingById(String uid) {
        Booking booking = bookingRepo.findByUid(uid).orElse(null);

        if (booking != null) {
            return "Booking ID: " + booking.getBid() + "\n" +
                    "User ID: " + booking.getUid() + "\n" +
                    "Package ID: " + booking.getPid() + "\n" +
                    "Vehicle ID: " + booking.getVid() + "\n" +
                    "No of Persons: " + booking.getPerson() + "\n" +
                    "Booking Date: " + booking.getBookingDate() + "\n" +
                    "Start Date: " + booking.getStartDate() + "\n" +
                    "End Date: " + booking.getEndDate() + "\n" +
                    "Total Amount: " + booking.getTotalAmount() + "\n" +
                    "Status: " + booking.getStatus() + "\n" +
                    "Payment Status: " + booking.getPaymentStatus();
        } else {
            return "Booking not found with User ID: " + uid;
        }

    }


}
