package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.*;

@RestController
public class PaymentController {

    @GetMapping(value="/payment")
    public Payment payment() {
        Payment x = new Payment();
        x.id = 13;
        x.status = "Paid";
        x.amount = 500;
        x.bookingID = 0001;
        return x;
    }

}