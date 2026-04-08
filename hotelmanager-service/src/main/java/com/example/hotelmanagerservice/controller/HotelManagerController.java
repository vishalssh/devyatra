package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.model.HotelManager;
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
    public HotelManager save(@RequestBody HotelManager manager){
        return service.save(manager);
    }


    @GetMapping("/getallmanagers")  //only admin
    public List<HotelManager> getallmanagers(){
        return service.getallmanagers();
    }

    @GetMapping("/getsingleId/{id}")    //admin or manager
    public HotelManager getManagerById(@PathVariable int id){
        return service.getManagerById(id);
    }

    @DeleteMapping("/delete/{id}")  //only admin
    public String deleteManagerById(@PathVariable int id){
        service.deleteManagerById(id);
        return "Manager deleted with id: " + id;
    }

    @PutMapping("/updatemanager/{id}")  //only admin
    public HotelManager updateManager(@PathVariable int id,@RequestBody HotelManager manager){
        return service.updateManager(id,manager);
    }
}
