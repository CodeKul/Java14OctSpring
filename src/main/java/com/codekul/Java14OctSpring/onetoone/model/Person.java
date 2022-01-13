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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adhar getAdhar() {
        return adhar;
    }

    public void setAdhar(Adhar adhar) {
        this.adhar = adhar;
    }
}
