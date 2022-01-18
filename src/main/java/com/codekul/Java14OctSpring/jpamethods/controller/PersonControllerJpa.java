package com.codekul.Java14OctSpring.jpamethods.controller;

import com.codekul.Java14OctSpring.jpamethods.domain.PersonJpa;
import com.codekul.Java14OctSpring.jpamethods.repository.PersonRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonControllerJpa {

    @Autowired
    private PersonRepositoryJpa personRepository;

    @PostMapping("savePersonJpa")
    public String savePersonJpa(@RequestBody PersonJpa personJpa){
        personRepository.save(personJpa);
        return "saved...";
    }

    @GetMapping("getPersonById/{id}/{name}")
    public Optional<PersonJpa> getPersonJpa(@PathVariable("id") Integer id,
                                            @PathVariable("name")String name){
        return personRepository.findById(id);
    }

    @GetMapping("getPersonByName/{name}")
    public List<PersonJpa> getPersonJpa(@PathVariable("name") String  name){
        return personRepository.findByName(name);
    }


    @GetMapping("getPersonByNameAndAddress")
    public PersonJpa getPersonByNameAndAddress(@RequestParam(value = "name",required = false) String  name,
                                               @RequestParam("address")String address){
        return personRepository.findByNameAndAddress(name,address);
    }

    @GetMapping("getPersonByNameOrAddress")
    public List<PersonJpa> getPersonByNameOrAddress(@RequestParam(value = "name",required = false) String  name,
                                               @RequestParam("address")String address){
        return personRepository.findByNameOrAddress(name,address);
    }


}
