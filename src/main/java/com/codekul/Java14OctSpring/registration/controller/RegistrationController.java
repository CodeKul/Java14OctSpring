package com.codekul.Java14OctSpring.registration.controller;

import com.codekul.Java14OctSpring.registration.domain.Registration;
import com.codekul.Java14OctSpring.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;


    @PostMapping("register")
    public String register(@Valid @RequestBody Registration registration){
        registrationRepo.save(registration);
        return "registered successfully..";
    }

    @PostMapping("login")
    public String login(@RequestBody LoginDto loginDto) {

        Registration registration
                = registrationRepo.findByUserNameAndPassword(loginDto.getUserName(), loginDto.getPassword());
        if (registration.getEmail() != null) {
            return "login successfully..";
        } else {
            return "login failed";
        }
    }

}
