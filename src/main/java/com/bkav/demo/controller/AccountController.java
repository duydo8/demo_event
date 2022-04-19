package com.bkav.demo.controller;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("findAllAccounts")
    public ResponseEntity<List<Accounts>> findAll(){
        return ResponseEntity.ok(accountService.getAll());
    }
    @PostMapping("createAccount")
    public  ResponseEntity<Accounts> createAccount(@RequestBody Accounts accounts){
        return ResponseEntity.ok(accountService.save(accounts));
    }
    @PutMapping("updateAccount")
    public ResponseEntity<Accounts> updateAccount(@RequestBody Accounts acc){
        return ResponseEntity.ok().body(accountService.save(acc));

    }
    @DeleteMapping("deleteAccount")
    public ResponseEntity<?> deleteAccount(@RequestParam("username") String name){
        accountService.delete(name);
        return  ResponseEntity.ok().body(null);
    }
}
