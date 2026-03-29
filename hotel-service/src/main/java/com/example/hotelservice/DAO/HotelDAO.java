package com.example.hotelservice.DAO;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.repository.HotelRepo;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelDAO implements HotelService {

    @Autowired
    private HotelRepo hotelrepo;

    @Override
    public Hotel register(Hotel hotel){
        return hotelrepo.save(hotel);
    }
}
