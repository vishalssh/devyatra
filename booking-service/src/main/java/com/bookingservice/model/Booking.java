package com.bookingservice.model;

import com.bookingservice.dto.HotelDto;
import com.bookingservice.dto.RoomDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    private String bookingId;

    private String userId;
    private String roomId;
    private int person;

    private BigDecimal totalAmount;
    private String status;
    private String paymentStatus;

    private LocalDateTime bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
    @Transient
    private List<HotelDto> hotelDetails = new ArrayList<>();
    @Transient
    private List<RoomDto> roomDetails = new ArrayList<>();
}
