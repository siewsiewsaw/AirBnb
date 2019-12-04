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
public class PropertyReviewController {

    @GetMapping(value="/propertyReview")
    public PropertyReview propertyReview() {
        PropertyReview x = new PropertyReview();
        x.id = 1;
        x.comments = "great";
        return x;
    }

    @GetMapping(value="/propertiesReview")
    public List<PropertyReview> propertiesReview(@RequestParam(name="comments") String comments) {
        PropertyReview[] arr = seedPropertyReview();
        ArrayList<PropertyReview> propertiesReview = new ArrayList<PropertyReview>();
        for(PropertyReview p: arr){
            if(p.getComments().equals(comments) ){
                propertiesReview.add(p);
            }
        }
        return propertiesReview;
    }

    @GetMapping(path="/propertiesReview/{id}")
    public PropertyReview userName(@PathVariable("id") int id){
        PropertyReview x = new PropertyReview();
        x.id = id;
        x.comments = "Great";
        return x;
    }

    private PropertyReview[] seedPropertyReview(){
        PropertyReview[] propertiesReview = {
            new PropertyReview(1, "Great"),
            new PropertyReview(2, "Good"),
            new PropertyReview(3, "Fair"),
            new PropertyReview(4, "Excellent"),
        };

        return propertiesReview;
    }

    @PostMapping(path="/propertiesReview")
    public PropertyReview createProperty(@RequestBody PropertyReview propertyReview){
        return propertyReview;
    }
}