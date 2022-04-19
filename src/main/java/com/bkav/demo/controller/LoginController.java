package com.bkav.demo.controller;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	AccountService service;
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestParam("username")String user,@RequestParam("password")String pass){
		System.out.println("chai");

		Accounts a = new Accounts("duyzt1","123");
		service.save(a);
		Accounts acc=  service.findById(user).get();
		if(acc==null) {
			return ResponseEntity.notFound().build();
		}else if(acc.getPassword().equals(pass)) {
				return ResponseEntity.ok().body(null);
		}else {

			return ResponseEntity.badRequest().body(null);
		}
	}
	
}
