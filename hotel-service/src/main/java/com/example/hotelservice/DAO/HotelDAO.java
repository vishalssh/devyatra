package com.example.hotelservice.DAO;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.repository.HotelRepo;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelDAO implements HotelService {

    @Autowired
    private HotelRepo hotelrepo;

    @Override
    public Hotel register(Hotel hotel){
        return hotelrepo.save(hotel);
    }

    @Override
    public Hotel getHotelById(int hotelId) {
        return hotelrepo.findById(hotelId).orElse(null);
    }

    @Override
    public List<Hotel> getAllHotels(){
        return hotelrepo.findAll();
    }


    @Override
    public List<Hotel> getHotelByLocation(String location){
        return hotelrepo.findByHotelLocation(location);
    }

    @Override
    public String deleteHotel(int hotelId) {
        hotelrepo.deleteById(hotelId);
        return "Hotel Deleted Successfully";
    }

    @Override
    public Hotel updateHotel(Hotel hotel){
        return hotelrepo.save(hotel);
    }


}
