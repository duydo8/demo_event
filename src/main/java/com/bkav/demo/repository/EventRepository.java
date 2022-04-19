package com.bkav.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bkav.demo.entities.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Integer>{
@Query("SELECT  e from Events e where e.accounts.username=?1")
    public Events getEventsByAccountsUserName(String username);
    @Query("SELECT  e from Events e where e.accounts.username=?1 and e.id=?2")
    public Events getEventsByAccountsUserNameAndId(String username,Integer id);
}
