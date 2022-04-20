package com.bkav.demo.service.impl;

import com.bkav.demo.entities.Events;
import com.bkav.demo.repository.EventRepository;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	EventRepository service;
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
	public void delete(int id) {
		// TODO Auto-generated method stub
		service.deleteById(id);

	}

	@Override
	public List<Events> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Optional<Events> findByIdEvent(int id) {
		return service.findById(id);
	}

	@Override
	public List<Events> getListEventByAccountMemberId(String usernameAccountMember) {
		return service.getListEventByAccountMemberId(usernameAccountMember);
	}


}
