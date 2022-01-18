package com.codekul.Java14OctSpring.manytomany.controller;

import com.codekul.Java14OctSpring.manytomany.domain.Courses;
import com.codekul.Java14OctSpring.manytomany.repository.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

    @Autowired
    private CoursesRepo coursesRepo;

    @PostMapping("saveCourses")
    public String saveCourses(@RequestBody Courses courses){
        coursesRepo.save(courses);
        return "Courses saved";
    }
}
