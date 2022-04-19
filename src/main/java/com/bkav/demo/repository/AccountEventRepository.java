package com.bkav.demo.repository;

import com.bkav.demo.entities.AccountEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountEventRepository extends JpaRepository<AccountEvent,Integer> {
}
