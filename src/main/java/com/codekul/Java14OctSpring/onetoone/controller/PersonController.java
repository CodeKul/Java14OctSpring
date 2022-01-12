package com.codekul.Java14OctSpring.onetoone.controller;

import com.codekul.Java14OctSpring.onetoone.repository.AdharRepository;
import com.codekul.Java14OctSpring.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private AdharRepository adharRepository;

    @Autowired
    private PersonRepository personRepository;



}
