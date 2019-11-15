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
public class PaymentController {

    @GetMapping(value="/payment")
    public Payment payment() {
        Payment x = new Payment();
        x.id = 13;
        x.address = "Bayan Lepas";
        return x;
    }

    @GetMapping(value="/payments")
    public List<Payment> payment(@RequestParam(name="location") String location) {
        Payment[] arr = seedPayment();
        ArrayList<Payment> properties = new ArrayList<Payment>();
        for(Payment p: arr){
            if(p.getLocation().equals(location) ){
                properties.add(p);
            }
        }
        return properties;
    }

    @GetMapping(path="/payments/{id}")
    public Payment userName(@PathVariable("id") int id){
        Payment x = new Payment();
        x.id = id;
        x.address = "Bayan Lepas";
        return x;
    }

    private Payment[] seedPayment(){
        Payments = {
            new Payment(1, "Bayan Lepas", "Penang"),
            new Payment(2, "PJ", "Selangor"),
            new Payment(3, "Tangkak", "Johor"),
            new Payment(4, "Melaka", "Melaka"),
        };

        return Payments;
    }

    @PostMapping(path="/payment")
    public Payment createPayment(@RequestBody Payment payment
        return property;
    }
}