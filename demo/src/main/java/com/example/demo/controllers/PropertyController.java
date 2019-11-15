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
public class PropertyController {

    @GetMapping(value="/property")
    public Property property() {
        Property x = new Property();
        x.id = 1;
        x.address = "Bayan Lepas";
        return x;
    }

    @GetMapping(value="/properties")
    public List<Property> properties(@RequestParam(name="address") String address) {
        Property[] arr = seedProperty();
        ArrayList<Property> properties = new ArrayList<Property>();
        for(Property p: arr){
            if(p.getAddress().equals(address) ){
                properties.add(p);
            }
        }
        return properties;
    }

    @GetMapping(path="/properties/{id}")
    public Property userName(@PathVariable("id") int id){
        Property x = new Property();
        x.id = id;
        x.address = "Bayan Lepas";
        return x;
    }

    private Property[] seedProperty(){
        Property[] properties = {
            new Property(1, "Bayan Lepas", "Penang"),
            new Property(2, "PJ", "Selangor"),
            new Property(3, "Tangkak", "Johor"),
            new Property(4, "Melaka", "Melaka"),
        };

        return properties;
    }

    @PostMapping(path="/properties")
    public Property createProperty(@RequestBody Property property){
        return property;
    }
}