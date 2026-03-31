package com.example.adminservice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Admin {
    @Id
    private String adminId;
    @Column(nullable = false)
    private String adminName;
    @Column(nullable = false)
    private String adminPass;

    @Transient
    private List<Users> userData=new ArrayList<>();


}
