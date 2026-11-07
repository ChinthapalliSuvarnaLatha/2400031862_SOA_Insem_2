package com.example.servicemocking;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUser() {
        return "Suvarna";
    }
}