package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.*;

@RestController
public class BookingController {

    @GetMapping(value="/booking")
    public Booking booking() {
        Booking x = new Booking();
        x.id = 3;
        x.propertyID = 1;
        x.price = 1000000;
        x.bookingAT.date = new Date();
        x.userID = 1;
        x.checkInAt = "12/24/2019";
        x.checkOutAt = "12/25/2019";
        x.createdAt = "11/12/2019";
        x.updatedAt = updatedAt;
        return x;
    }

    @GetMapping(value="/bookings")
    public List<Booking> bookings(@RequestParam(name="id") Int id) {
        Booking[] arr = seedBooking();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        for(Booking p: arr){
            if(p.getId().equals(Id) ){
                bookings.add(p);
            }
        }
        return bookings;
    }

    @GetMapping(path="/booking/{id}")
    public Booking bookingID(@PathVariable("id") int id){
        Booking x = new Booking();
        x.id = id;
        x.propertyID = propertyID;
        x.price = price;
        x.bookingAT = bookingAT;
        x.userID = userID;
    public Date checkInAt;
    public Date checkOutAt;
    public Date createdAt;
    public Date updatedAt;
        return x;
    }

    private Booking[] seedProperty(){
        Booking[] bookings = {
            new Booking(1, "Bayan Lepas", "Penang"),
            new Booking(2, "PJ", "Selangor"),
            new Booking(3, "Tangkak", "Johor"),
            new Booking(4, "Melaka", "Melaka"),
        };

        return bookings;
    }

    @PostMapping(path="/properties")
    public Booking createProperty(@RequestBody Booking booking){
        return booking;
    }
}