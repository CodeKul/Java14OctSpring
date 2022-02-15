package com.codekul.Java14OctSpring.registration.repository;

import com.codekul.Java14OctSpring.registration.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {

    Registration findByUserNameAndPassword(String userName, String password);

}
