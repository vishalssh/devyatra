package com.example.adminservice.DAO;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import com.example.adminservice.repository.AdminRepo;
import com.example.adminservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AdminDao implements AdminService {

    @Autowired
    private AdminRepo ar;

    @Autowired
    private RestTemplate rt;


    @Override
    public Admin saveAdmin(Admin admin) {
        return ar.save(admin);
    }

    @Override
    public List<Users> getAllUsers() {
        String url = "http://localhost:8080/users/getAllUsers";
        ResponseEntity<List<Users>> response = rt.exchange(url, HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Users>>() {}
        );
        return response.getBody();
    }

    @Override
    public Users getUserById(String userId) {
        String url = "http://localhost:8080/users/getUser/"+ userId;
        return rt.getForObject(url, Users.class);
    }


}
