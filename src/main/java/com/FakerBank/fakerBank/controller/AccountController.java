package com.FakerBank.fakerBank.controller;

import com.FakerBank.fakerBank.model.Account;
import com.FakerBank.fakerBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountsRepository;

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam int id) {
        Account accounts = accountsRepository.findByCustomerId(id);
        if (accounts != null ) {
            return accounts;
        }else {
            return null;
        }
    }
}
