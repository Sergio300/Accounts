package com.example.demo.service;

import com.example.demo.Accounts.Account;
import org.springframework.web.bind.annotation.RequestParam;

public interface AccountServiceInterface {
    public Account Details(@RequestParam Account account);
}
