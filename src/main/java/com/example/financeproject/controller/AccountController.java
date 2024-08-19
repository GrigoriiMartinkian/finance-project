package com.example.financeproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.financeproject.models.Account;
import com.example.financeproject.services.AccountService;
import com.example.financeproject.dto.AccountDto;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        Account account = accountService.createAccount(accountDto);
        return ResponseEntity.ok(new AccountDto(account));
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        List<AccountDto> accountDtos = accounts.stream()
                .map(AccountDto::new)
                .toList();
        return ResponseEntity.ok(accountDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
        Account account = accountService.getAccountById(id);
        return ResponseEntity.ok(new AccountDto(account));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable Long id, @RequestBody AccountDto accountDto) {
        Account updatedAccount = accountService.updateAccount(id, accountDto);
        return ResponseEntity.ok(new AccountDto(updatedAccount));
    }


}
