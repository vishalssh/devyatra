package com.example.hotelmanagerservice.external;

import com.example.hotelmanagerservice.model.Hotel;
import com.example.hotelmanagerservice.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "hotel-service")
public interface HotelClient {

    @PostMapping("/hotel/registerHotel")
    Hotel register(@RequestBody Hotel hotel);

    @GetMapping("/hotel/getHotelById/{hotelId}")
    Hotel getHotelById(@PathVariable int hotelId);

    @GetMapping("/hotel/getAllHotels")
    List<Hotel> getAllHotels();

    @GetMapping("/hotel/location/{location}")
    List<Hotel> getByLocation(@PathVariable String location);

    @DeleteMapping("/hotel/{hotelId}")
    String deleteHotel(@PathVariable int hotelId);

    @PutMapping("/hotel/updateHotel/{hotelId}")
    Hotel updateHotel(@PathVariable int hotelId, @RequestBody Hotel hotel);

    // room API

    @PostMapping("/room/addRoom")
    Room addRoom(@RequestBody Room room);

    @GetMapping("/room/getRoomById/{roomId}")
    Room getRoomById(@PathVariable int roomId);

    @GetMapping("/room/getAllRooms")
    List<Room> getAllRooms();

    @PutMapping("/room/updateRoom/{roomId}")
    Room updateRoom(@PathVariable int roomId, @RequestBody Room room);

    @DeleteMapping("/room/deleteRoom/{roomId}")
    String deleteRoom(@PathVariable int roomId);

    @GetMapping("/room/available")
    List<Room> getAvailableRooms();

    @GetMapping("/room/hotel/{hotelId}")
    List<Room> getRoomsByHotelId(@PathVariable int hotelId);
}
