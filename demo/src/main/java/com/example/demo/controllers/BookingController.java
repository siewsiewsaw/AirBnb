package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.*;

@RestController
public class BookingController {

    @GetMapping(value="/bookings")
    public Booking booking() {
        Booking x = new Booking();
        x.id = 3;
        x.propertyID = 1;
        x.price = 1000000;
       
      
     return x;
    }

}