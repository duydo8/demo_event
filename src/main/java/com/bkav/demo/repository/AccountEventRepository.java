package com.bkav.demo.repository;

import com.bkav.demo.entities.AccountEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEventRepository extends JpaRepository<AccountEvent,Long> {

}
