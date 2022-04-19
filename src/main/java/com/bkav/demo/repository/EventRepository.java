package com.bkav.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bkav.demo.entities.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Integer>{

}
