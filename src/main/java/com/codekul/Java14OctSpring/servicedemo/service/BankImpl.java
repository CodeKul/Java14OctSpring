package com.codekul.Java14OctSpring.servicedemo.service;

import com.codekul.Java14OctSpring.servicedemo.domain.Bank;
import com.codekul.Java14OctSpring.servicedemo.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankImpl implements BankService{

    @Autowired
    private BankRepository bankRepository;

    @Override
    public void saveBank(Bank bank) {
        bankRepository.save(bank);
    }
}
