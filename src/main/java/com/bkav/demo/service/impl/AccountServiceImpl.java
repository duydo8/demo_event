package com.bkav.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.repository.AccountRepository;
import com.bkav.demo.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository service;
	@Override
	public Accounts save(Accounts e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public Accounts update(Accounts e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
	}

	@Override
	public List<Accounts> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Optional<Accounts> findById(String id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

}
