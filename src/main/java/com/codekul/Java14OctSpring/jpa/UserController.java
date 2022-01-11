package com.codekul.Java14OctSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "user saved";
    }

    @GetMapping("getUserList")
    public List<User> getUserDetails(){
        List<User> userList =  userRepository.findAll();
        return userList;
    }
}
