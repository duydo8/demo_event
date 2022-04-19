package com.bkav.demo.controller;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("findAllAccounts")
    public ResponseEntity<List<Accounts>> finall(){
        return
    }

}
