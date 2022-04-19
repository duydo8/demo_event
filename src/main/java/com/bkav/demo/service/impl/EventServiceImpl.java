package com.bkav.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bkav.demo.entities.Events;
import com.bkav.demo.repository.EventRepository;
import com.bkav.demo.service.EventService;

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
	

}