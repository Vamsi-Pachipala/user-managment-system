package com.example.userManagementSystem.controller;


import com.example.userManagementSystem.entity.User;
import com.example.userManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody User user){
        String ans = userService.add(user);
        return new ResponseEntity<String>(ans, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<User> get(@RequestParam("id") int id){
        User user = userService.get(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
