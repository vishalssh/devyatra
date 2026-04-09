package com.example.hotelmanagerservice.DAO;

import com.example.hotelmanagerservice.external.HotelClient;
import com.example.hotelmanagerservice.external.RoomClient;
import com.example.hotelmanagerservice.model.Hotel;
import com.example.hotelmanagerservice.model.HotelManager;
import com.example.hotelmanagerservice.repository.HotelManagerRepo;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelManagerDAO implements HotelManagerService {

    @Autowired
    HotelManagerRepo managerrepo;

    @Autowired
    private HotelClient hotelClient;

    @Autowired
    private RoomClient roomClient;

    @Override
    public HotelManager save(HotelManager manager) {
        return managerrepo.save(manager);
    }

    @Override
    public List<HotelManager> getallmanagers(){
        return managerrepo.findAll();
    }

    @Override
    public HotelManager getManagerById(int id){
        return managerrepo.findById(id).orElse(null);
    }

    @Override
    public void deleteManagerById(int id){
        managerrepo.deleteById(id);
    }

    @Override
    public HotelManager updateManager(int id ,HotelManager manager){
        Optional<HotelManager> existing=managerrepo.findById(id);
        if(existing.isPresent()){
            HotelManager m=existing.get();
            m.setManagerName(manager.getManagerName());
            m.setManagerEmail(manager.getManagerEmail());
            m.setManagerPassword(manager.getManagerPassword());
            m.setManagerContact(manager.getManagerContact());
            return managerrepo.save(m);
        }
        return null;
    }

    // HotelClient Dao  ---------

    @Override
    public Hotel getHotel(int id) {
        return hotelClient.getHotelById(id);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelClient.getAllHotels();
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelClient.register(hotel);
    }
}
