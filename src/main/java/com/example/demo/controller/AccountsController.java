package com.example.demo.controller;

import com.example.demo.Accounts.Account;
import com.example.demo.Accounts.Payment;
import com.example.demo.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class AccountsController {

    private final AccountsService accountService;

    @Autowired
    public AccountsController(AccountsService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<List<Payment>> calculatePayments(@RequestBody Account account) {
        List<Payment> payments = accountService.calculatePayments(account);
        return ResponseEntity.ok(payments);
    }
}

/*
import com.example.demo.Accounts.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/getDetails")
    //@RequestBody
    private Account Details(@RequestParam Account account){
        return null;
    }
}
 */
