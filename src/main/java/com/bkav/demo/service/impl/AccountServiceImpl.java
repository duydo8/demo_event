package com.bkav.demo.service.impl;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.repository.AccountRepository;
import com.bkav.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository service;
	@Override
	public Accounts save(Accounts e) {
		return service.save(e);
	}

	@Override
	public Accounts update(Accounts e) {
		return service.save(e);
	}

	@Override
	public void delete(String id) {
		service.deleteById(id);
	}

	@Override
	public List<Accounts> getAll() {
		return service.findAll();
	}

	@Override
	public Optional<Accounts> findById(String id) {
		return service.findById(id);
	}



	@Override
	public List<Accounts> getListAccountByIdEvent(Long idEvent) {
		return service.getListAccountByIdEvent(idEvent);
	}

}
