package com.codekul.Java14OctSpring.validation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class ValidationDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name can not be null")
    private String name;

    private String address;

    @NotNull(message = "email can not be null")
    @Email(message = "email should be in format")
    private String email;

    @Column(length = 500)
    private String about;
}
