package com.bkav.demo.service;

import java.util.List;
import java.util.Optional;

import com.bkav.demo.entities.Accounts;

public interface AccountService {
	Accounts save(Accounts e);
	Accounts update(Accounts e);
	void delete(String id);
	List<Accounts> getAll();
	Optional<Accounts> findById(String id);
}
