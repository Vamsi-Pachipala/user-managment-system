package com.example.userManagementSystem.service;


import com.example.userManagementSystem.entity.User;
import com.example.userManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String add(User user){
        userRepository.save(user);
        return "User added Successfully";
    }
    public User get(int id){
        User user = userRepository.findById(id).get();
        return user;
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
