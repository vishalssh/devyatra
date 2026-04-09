package com.example.hotelmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HotelManagerServiceApplication {
    public static void main (String args[]){
        SpringApplication.run( HotelManagerServiceApplication.class,args);
    }
}
