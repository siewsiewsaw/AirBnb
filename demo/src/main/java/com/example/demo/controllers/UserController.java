// package com.example.demo.controllers;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;
// import java.util.Date;
// import com.example.demo.entities.User;
// import com.example.demo.repositories.UserRepository;

// @RestController
// public class UserController {

//     @Autowired
//     UserRepository repo;
    
//     @GetMapping(value="/User")
//     public List<User> index(
//        @RequestParam(name="name", required=false) String name,
//        @RequestParam(name="email", required=false) String email,
//        @RequestParam(name="contactNo", required=false) String contactNo,
//        @RequestParam(name="createdAt",required=false) Date createdAt,
//        @RequestParam(name="updatedAt",required=false) Date updatedAt

//     ) {
//         if (name != null) {
//             return repo.searchByUserName(name);
//         }
    
//         return repo.findAll();
//     }

// }