package com.bookingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    private String bookingId;

    private String userId;
    private String vehicleId;
    private int person;

    private BigDecimal totalAmount;
    private String status;
    private String paymentStatus;

    private LocalDateTime bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
}
