package com.bkav.demo.service;

import com.bkav.demo.entities.AccountEvent;

import java.util.List;

public interface AccountEventService {
    AccountEvent save(AccountEvent accountEvent);
    void deleteByIdAccountCreatorAndIdEvent(int idAccountCreator, int idEvent);
    List<AccountEvent> getAll();
    void deleteByIdAccountAndIdEvent(int idAccount, int idEvent);

}
