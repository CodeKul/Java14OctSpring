package com.codekul.Java14OctSpring.colorlib.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ColorLib {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String company;

    private String email;

    private Long phoneNumber;

    private String mealPreference;

    private String paymentMode;

    private Integer checkNumber;

    private String bankName;

    private String payableAt;
}
