package com.bryan.forgrowth.controller.facade.impl;

import com.bryan.forgrowth.controller.facade.AccountFacade;
import com.bryan.forgrowth.controller.request.InsertAccountRequest;
import com.bryan.forgrowth.model.jpa.Account;
import com.bryan.forgrowth.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Service
public class AccountFacadeImpl implements AccountFacade {
    private AccountRepository accountRepository;

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void addingNewAccount(InsertAccountRequest request) {
        Account acc = new Account();
        acc.setEmail(request.getEmail());
        acc.setId(new Timestamp(System.currentTimeMillis()).getTime()+""+new Date().getTime());
        acc.setGmtCreated(LocalDate.now());
        acc.setPassword(request.getPassword());
        acc.setGmtUpdated(LocalDate.now());
        acc.setPhoneNumber(request.getPhoneNumber());

        accountRepository.save(acc);
    }
}
