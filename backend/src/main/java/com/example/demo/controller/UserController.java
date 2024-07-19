//// src/main/java/com/example/demo/controller/UserController.java
//package com.example.demo.controller;
//
//import com.example.demo.entity.User;
//import com.example.demo.model.User;
//import com.example.demo.services.UserServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/v1/user")
//public class UserController {
//
//    @Autowired
//    private UserServices userServices;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/register")
//    public ResponseEntity<User> registerUser(@RequestBody User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        user.setRole("USER"); // Default role for new users
//        User registeredUser = userServices.register(user);
//        return ResponseEntity.ok(registeredUser);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<User> loginUser(@RequestBody User user) {
//        Optional<User> foundUser = userServices.findByEmail(user.getEmail());
//        if (foundUser.isPresent() && passwordEncoder.matches(user.getPassword(), foundUser.get().getPassword())) {
//            return ResponseEntity.ok(foundUser.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }
//}
