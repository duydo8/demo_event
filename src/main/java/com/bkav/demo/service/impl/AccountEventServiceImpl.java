package com.bkav.demo.service.impl;

import com.bkav.demo.entities.AccountEvent;
import com.bkav.demo.service.AccountEventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountEventServiceImpl implements AccountEventService {
    @Override
    public AccountEvent save(AccountEvent accountEvent) {
        return null;
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
