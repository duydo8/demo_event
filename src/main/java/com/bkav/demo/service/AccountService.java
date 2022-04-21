package com.bkav.demo.service;

import com.bkav.demo.entities.Accounts;

import java.util.List;
import java.util.Optional;

public interface AccountService {
	Accounts save(Accounts e);

	Accounts update(Accounts e);

	void delete(String id);

	List<Accounts> getAll();

	Optional<Accounts> findById(String id);



	List<Accounts> getListAccountByIdEvent(Long idEvent);
}
