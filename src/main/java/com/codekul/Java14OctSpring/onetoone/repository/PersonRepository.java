package com.codekul.Java14OctSpring.onetoone.repository;

import com.codekul.Java14OctSpring.onetoone.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
