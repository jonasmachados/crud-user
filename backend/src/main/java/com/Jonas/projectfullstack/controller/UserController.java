package com.Jonas.projectfullstack.controller;

import com.Jonas.projectfullstack.entities.User;
import com.Jonas.projectfullstack.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
    
}
