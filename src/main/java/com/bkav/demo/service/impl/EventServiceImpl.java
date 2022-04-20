package com.bkav.demo.service.impl;

import com.bkav.demo.entities.AccountEvent;
import com.bkav.demo.entities.Accounts;
import com.bkav.demo.entities.Events;
import com.bkav.demo.repository.EventRepository;
import com.bkav.demo.service.AccountService;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	EventRepository service;

	@Autowired
	AccountService accountService;
	@Override
	public Events save(Events e) {
		// TODO Auto-generated method stub

		return service.save(e);
	}

	@Override
	public Events update(Events e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		service.deleteById(id);

	}

	@Override
	public List<Events> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Optional<Events> findByIdEvent(Long id) {
		return service.findById(id);
	}

	@Override
	public List<Events> getListEventByAccountMemberId(String usernameAccountMember) {
		Accounts acc=accountService.findById(usernameAccountMember).get();

		List<AccountEvent>accountEventList=acc.getAccountEventList();
		List<Events> eventsList =new ArrayList<>();
		for (AccountEvent ae :accountEventList) {
			System.out.println(ae.toString());;
			eventsList.add(ae.getEvents());
		}
		return eventsList;
		//return service.getListEventByAccountMemberId(usernameAccountMember);
	}


}
