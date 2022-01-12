package com.codekul.Java14OctSpring.onetoone.model;

import com.codekul.Java14OctSpring.onetoone.model.Adhar;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    String email;

    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
    private Adhar adhar;


}
