package com.bkav.demo.repository;

import com.bkav.demo.entities.AccountEventAttendent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEventAttendantRepository extends JpaRepository<AccountEventAttendent,String> {

}
