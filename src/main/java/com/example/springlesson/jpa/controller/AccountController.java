package com.example.springlesson.jpa.controller;

import com.example.springlesson.jpa.entity.Account;
import com.example.springlesson.jpa.server.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @PostMapping
    public void addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
    }
}
