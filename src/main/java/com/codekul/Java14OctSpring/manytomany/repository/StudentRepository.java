package com.codekul.Java14OctSpring.manytomany.repository;

import com.codekul.Java14OctSpring.manytomany.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
