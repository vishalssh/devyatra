package com.example.hotelmanagerservice.external;

import com.example.hotelmanagerservice.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "room-service")
public interface RoomClient {

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
