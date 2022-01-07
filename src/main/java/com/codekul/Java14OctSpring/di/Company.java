package com.codekul.Java14OctSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    private Integer id;

    private String companyName;

    private String address;

    @Autowired
    private Employee employee;

    @Autowired
    private Employee employee1;

//setter based injection
//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }


    //constructor based injection
//    @Autowired
//    public Company(Employee employee){
//        this.employee=  employee;
//    }

    public void showCompanyEmp(){
        employee.empShow();
        employee1.empShow();
    }

}
