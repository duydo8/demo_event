package com.bkav.demo.service;

import java.util.List;

import com.bkav.demo.entities.Events;

public interface EventService {
	Events save(Events e);
	Events update(Events e);

	Events findByIdPerSon(String username);

	Events findByIdPerSonAndId(String username,int id);

	void delete(int id);
	List<Events> getAll();
}
