package com.bkav.demo.service.impl;

import com.bkav.demo.entities.AccountEvent;
import com.bkav.demo.entities.AccountEventAttendent;
import com.bkav.demo.repository.AccountEventAttendantRepository;
import com.bkav.demo.service.AccountEventAttendentService;
import com.bkav.demo.service.AccountEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountEventAttendentServiceImpl implements AccountEventAttendentService {
    @Autowired
    AccountEventAttendantRepository accountEventAttendantRepository;
    @Override
    public AccountEventAttendent save(AccountEventAttendent accountEventAttendent) {
        return accountEventAttendantRepository.save(accountEventAttendent);
    }

    @Override
    public AccountEventAttendent update(AccountEventAttendent accountEventAttendent) {
        return accountEventAttendantRepository.save(accountEventAttendent);
    }

    @Override
    public void delete(String name) {
    accountEventAttendantRepository.deleteById(name);
    }

    @Override
    public AccountEventAttendent findById(String name) {
        return accountEventAttendantRepository.getOne(name);
    }

    @Override
    public List<AccountEventAttendent> getAll() {
        return accountEventAttendantRepository.findAll();
    }


}
