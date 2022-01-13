package com.codekul.Java14OctSpring.onetoone.controller;

import com.codekul.Java14OctSpring.onetoone.model.Adhar;
import com.codekul.Java14OctSpring.onetoone.model.Person;
import com.codekul.Java14OctSpring.onetoone.repository.AdharRepository;
import com.codekul.Java14OctSpring.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private AdharRepository adharRepository;

    @Autowired
    private PersonRepository personRepository;


    @PostMapping("savePerson")
    public String savePerson(){
        Person person = new Person();
        Adhar adhar = new Adhar();

        person.setName("Rahul");
        person.setEmail("rahul@gmail.com");

        adhar.setAdharNumber(42342342342L);
        adhar.setAddress("Pune");
        adhar.setContactNumber(43535345L);

        person.setAdhar(adhar);
        adhar.setPerson(person);

        personRepository.save(person);
        adharRepository.save(adhar);

        return "Person and adhar saved";
    }

    @GetMapping("getPersonList")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }


}
