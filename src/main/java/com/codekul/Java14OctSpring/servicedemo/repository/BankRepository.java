package com.codekul.Java14OctSpring.servicedemo.repository;

import com.codekul.Java14OctSpring.servicedemo.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Integer> {
}
