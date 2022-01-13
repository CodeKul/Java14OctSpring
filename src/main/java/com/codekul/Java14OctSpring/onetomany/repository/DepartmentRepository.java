package com.codekul.Java14OctSpring.onetomany.repository;

import com.codekul.Java14OctSpring.onetomany.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
