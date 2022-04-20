package com.bkav.demo.service;

import com.bkav.demo.entities.Events;

import java.util.List;
import java.util.Optional;

public interface EventService {
    Events save(Events e);

    Events update(Events e);


    void delete(Long id);

    List<Events> getAll();

    Optional<Events> findByIdEvent(Long id);

    List<Events> getListEventByAccountMemberId(String usernameAccountMember);
}
