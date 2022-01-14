package com.codekul.Java14OctSpring.onetomany.controller;

import com.codekul.Java14OctSpring.onetomany.model.Department;
import com.codekul.Java14OctSpring.onetomany.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("saveDepartment")
    public String saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "saved department...";
    }

    @GetMapping("getDepartmentList")
    public List<Department> getDepartmentList(){
        return departmentRepository.findAll();
    }

    @DeleteMapping("deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id")Integer id){
        departmentRepository.deleteById(id);
        return "department deleted...";
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