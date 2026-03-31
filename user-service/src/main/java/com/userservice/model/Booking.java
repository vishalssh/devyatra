package com.userservice.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Booking {
    private String bid;

    private String userId;
    private String pid;
    private String vid;
    private int person;

    private BigDecimal totalAmount;
    private String status;
    private String paymentStatus;

    private LocalDateTime bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
}
