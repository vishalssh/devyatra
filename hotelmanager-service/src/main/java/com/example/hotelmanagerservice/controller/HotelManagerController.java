package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.model.Hotelmanager;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelmanager")
public class HotelManagerController {
    @Autowired
    HotelManagerService service;

    @PostMapping("/save") //only admin can register
    public Hotelmanager save(@RequestBody Hotelmanager manager){
        return service.save(manager);
    }


    @GetMapping("/getallmanagers")  //only admin
    public List<Hotelmanager> getallmanagers(){
        return service.getallmanagers();
    }

    @GetMapping("/getsingleId/{id}")    //admin or manager
    public Hotelmanager getManagerById(@PathVariable int id){
        return service.getManagerById(id);
    }

    @DeleteMapping("/delete/{id}")  //only admin
    public String deleteManagerById(@PathVariable int id){
        service.deleteManagerById(id);
        return "Manager deleted with id: " + id;
    }

    @PutMapping("/updatemanager/{id}")  //only admin
    public Hotelmanager updateManager(@PathVariable int id,@RequestBody Hotelmanager manager){
        return service.updateManager(id,manager);
    }
}
