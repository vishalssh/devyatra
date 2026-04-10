package com.authservice.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class AuthRequest {
    public String username;
    public String password;

}
