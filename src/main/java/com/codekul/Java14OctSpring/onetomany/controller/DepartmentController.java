package com.codekul.Java14OctSpring.onetomany.controller;

import com.codekul.Java14OctSpring.onetomany.model.Department;
import com.codekul.Java14OctSpring.onetomany.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("saveDepartment")
    public String saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "saved department...";
    }
}
/**
 * {
 *     "name":"Physics",
 *     "code":"p001",
 *     "teacher":[
 *         {
 *             "tName":"Suhas",
 *             "tAddress":"Pune",
 *             "contact":3424234
 *
 *         },
 *          {
 *             "tName":"AKash",
 *             "tAddress":"Mumbai",
 *             "contact":34244554
 *
 *         }
 *
 *     ]
 * }
 */