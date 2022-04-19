package com.bkav.demo.service;

import java.util.List;

import com.bkav.demo.entities.Events;

public interface EventService {
	Events save(Events e);
	Events update(Events e);
	void delete(int id);
	List<Events> getAll();
}
