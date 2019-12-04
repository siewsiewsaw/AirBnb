package com.example.demo.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Booking;
import com.example.demo.repositories.BookingRepository;

@RestController
public class BookingController {

    @Autowired
    BookingRepository repo;
    
    @GetMapping(value="/bookings")
    public List<Booking> index(
        @RequestParam(name="bookingDate",required=false) Date bookingDate,
        @RequestParam(name="checkIn",required=false) Date checkIn,
        @RequestParam(name="checkOut",required=false) Date checkOut,
        @RequestParam(name="createdAt",required=false) Date createdAt,
        @RequestParam(name="updatedAt",required=false) Date updatedAt
      ) {
        if (bookingDate != null) {
            return repo.searchByBookingIdContains(bookingDate);
        }
    
        return repo.findAll();
    }

}