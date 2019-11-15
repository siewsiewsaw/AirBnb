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
public class PropertyTagController {

    @GetMapping(value="/propertyTag")
    public PropertyTag propertyTag() {
        PropertyTag x = new PropertyTag();
        x.id = 1;
        x.lable = "Bayan Lepas Luxury Condo";
        return x;
    }

    @GetMapping(value="/propertiesTag")
    public List<PropertyTag> propertiesTag(@RequestParam(name="lable") String lable) {
        PropertyTag[] arr = seedPropertyTag();
        ArrayList<PropertyTag> propertiesTag = new ArrayList<PropertyTag>();
        for(PropertyTag p: arr){
            if(p.getLable().equals(lable) ){
                propertiesTag.add(p);
            }
        }
        return propertiesTag;
    }

    @GetMapping(path="/properties/{id}")
    public PropertyTag propertyName(@PathVariable("id") int id){
        PropertyTag x = new PropertyTag();
        x.id = id;
        x.lable = "Bayan Lepas";
        return x;
    }

    private PropertyTag[] seedPropertyTag(){
        PropertyTag[] propertiesTag = {
            new PropertyTag(1, "Bayan Lepas Luxury Condo"),
            new PropertyTag(2, "Sungai Ara Banglow"),
            new PropertyTag(3, "Jelutong Soho Apartment"),
            new PropertyTag(4, "Balik Pulau Teres House"),
        };

        return propertiesTag;
    }

    @PostMapping(path="/propertiesTag")
    public PropertyTag createProperty(@RequestBody PropertyTag propertyTag){
        return propertyTag;
    }
}