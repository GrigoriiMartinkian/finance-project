package com.example.financeproject.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private long AccountId;
    private final long id;
    private final Account account;
    private BigDecimal amount;
    private final LocalDate date;
    private final String description;
    private final Category category;

    public Transaction(long id, Account account, BigDecimal amount, LocalDate date, String description, Category category) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.category = category;
    }


    public long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    // Обновление суммы транзакции
    public void updateAmount(BigDecimal newAmount) {
        this.amount = newAmount;
    }
}
