package com.bkav.demo.service;

import com.bkav.demo.entities.AccountEventAttendent;

import java.util.List;

public interface AccountEventAttendentService {
    AccountEventAttendent save (AccountEventAttendent accountEventAttendent);
    AccountEventAttendent update(AccountEventAttendent accountEventAttendent);
    void delete(String name);
    AccountEventAttendent findById(String name);
    List<AccountEventAttendent> getAll();

}
