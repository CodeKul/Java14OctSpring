package com.codekul.Java14OctSpring.manytomany.repository;

import com.codekul.Java14OctSpring.manytomany.domain.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Integer> {
}
