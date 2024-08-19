package com.example.financeproject.dto;

import com.example.financeproject.models.Account;
import com.example.financeproject.models.AccountType;

public class AccountDto {
    private Long id;
    private String name;
    private AccountType accountType;
    private double balance;
    private String currency;

    // Конструктор


    public AccountDto(Long id, String name, AccountType accountType, double balance, String currency) {
        this.id = id;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.currency = currency;
    }

    public AccountDto(Account account) {
        this.id = account.getId();
        this.name = account.getName();
        this.accountType = account.getType();
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

