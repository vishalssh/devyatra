package com.bookingservice.repository;

import com.bookingservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepo extends JpaRepository<Booking, String> {

    Optional<Booking> findByUid(String uid);
}
