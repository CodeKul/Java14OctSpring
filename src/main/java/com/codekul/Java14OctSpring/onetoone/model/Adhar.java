package com.codekul.Java14OctSpring.onetoone.model;

import javax.persistence.*;

@Entity
public class Adhar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Long adharNumber;

    private String address;

    private String contactNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

}
