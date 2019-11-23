package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.*;

@RestController
public class UserController {

    @GetMapping(value="/users")
    public Users users() {
        Users x = new Users();
        x.id = 10;
        x.name = "Siew Siew";
        x.contactNo = "0124567890";
    
        return x;
    }

}