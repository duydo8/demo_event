package com.bkav.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bkav.demo.entities.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, String>{
    @Query("select a from Accounts  a where a.username=?1")
    Accounts findByUsername(String username);
}
