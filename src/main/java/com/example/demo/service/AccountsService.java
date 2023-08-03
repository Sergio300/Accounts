package com.example.demo.service;

import com.example.demo.Accounts.Account;
import com.example.demo.Accounts.Payment;
import com.example.demo.Accounts.SimpleInterestCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    private final SimpleInterestCalculator calculator;

    @Autowired
    public AccountsService(SimpleInterestCalculator calculator) {
        this.calculator = calculator;
    }

    public List<Payment> calculatePayments(Account account) {
        return calculator.calculatePayments(account);
    }
}

/*
import com.example.demo.Accounts.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AccouuntsService implements AccountServiceInterface{
    public Account Details(@RequestParam Account account){

        return null;
    }
}
*/