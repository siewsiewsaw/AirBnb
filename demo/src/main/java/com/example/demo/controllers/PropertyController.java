package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.*;

@RestController
public class PropertyController {

    @GetMapping(value="/property")
    public Property property() {
        Property x = new Property();
        x.id = 1;
        x.address = "Bayan Lepas";
        return x;
    }


}