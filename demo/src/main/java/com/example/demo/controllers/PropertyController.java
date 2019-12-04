// package com.example.demo.controllers;

// import java.util.List;
// import java.util.Date;

// import com.example.demo.entities.Property;
// import com.example.demo.repositories.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


// @RestController
// public class PropertyController {

//     @Autowired
//     PropertyRepository repo;
    
//     @GetMapping(value="/Property")
//     public List<Property> index(
//        @RequestParam(name="id", required=false) Long id, 
//        @RequestParam(name="address", required=false) String address,
//        @RequestParam(name="createdAt",required=false) Date createdAt,
//        @RequestParam(name="updatedAt",required=false) Date updatedAt,
//        @RequestParam(name="owner_id", required=false) String owner_id
     
//     ) {
//         if (address != null) {
//             return repo.searchByPropertyIdContains(id);
//         }
    
//         return repo.findAll();
//     }

// }