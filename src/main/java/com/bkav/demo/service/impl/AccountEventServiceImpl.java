package com.bkav.demo.service.impl;

import com.bkav.demo.entities.AccountEvent;
import com.bkav.demo.repository.AccountEventRepository;
import com.bkav.demo.service.AccountEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountEventServiceImpl implements AccountEventService {
    @Autowired
    AccountEventRepository accountEventRepository;

    @Override
    public AccountEvent save(AccountEvent accountEvent) {
        return accountEventRepository.save(accountEvent);
    }

    @Override
    public void deleteByIdAccountCreatorAndIdEvent(int idAccountCreator, int idEvent) {


    }


    @Override
    public List<AccountEvent> getAll() {
        return null;
    }

    @Override
    public void deleteByIdAccountAndIdEvent(int idAccount, int idEvent) {

    }
}
