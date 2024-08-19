package com.example.financeproject.models;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Account {

    private final long id;
    private final AccountType type;
    private String name;
    private BigDecimal balance;
    private LocalDate balanceDate;
    private Currency currency;
    private ArrayList<Long> transactions;


    public Account(long id, AccountType type, String name, BigDecimal balance, LocalDate balanceDate, Currency currency) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.balance = balance;
        this.balanceDate = balanceDate;
        this.currency = currency;
    }


    // Методы доступа
    public long getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDate getBalanceDate() {
        return balanceDate;
    }

    public Currency getCurrency() {
        return currency;
    }



    // Методы для обновления данных счета
    public void updateBalance(BigDecimal newBalance, LocalDate newDate) {
        this.balance = newBalance;
        this.balanceDate = newDate;
    }


}
