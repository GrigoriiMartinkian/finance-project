package com.example.financeproject.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long type;
    private String name;
    private BigDecimal balance;
    private LocalDate balanceDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "currency_id", nullable = false)
    private Currency currency;

    @OneToOne
    @JoinColumn(name = "categoriesList_id", nullable = false)
    private CategoriesList categoriesList;

    public Account(){

    }

    // Методы для обновления данных счета
    public void updateBalance(BigDecimal newBalance, LocalDate newDate) {
        this.balance = newBalance;
        this.balanceDate = newDate;
    }
}

