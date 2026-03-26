package com.bookingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    private String bid;

    private String uid;
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
