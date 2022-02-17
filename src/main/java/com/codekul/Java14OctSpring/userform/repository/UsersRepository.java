package com.codekul.Java14OctSpring.userform.repository;

import com.codekul.Java14OctSpring.userform.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
