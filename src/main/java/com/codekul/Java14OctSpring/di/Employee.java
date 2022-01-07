package com.codekul.Java14OctSpring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Employee {

    private Integer id;

    private String name;

    private Long contactNumber;

    public Employee() {
        System.out.println("EMp object created..");
    }

    public void empShow(){
        System.out.println("IN Employee");
    }
}
