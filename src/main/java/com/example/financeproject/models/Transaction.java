package com.example.financeproject.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    private BigDecimal amount;
    private LocalDate date;
    private String description;

    // Обновление суммы транзакции
    public void updateAmount(BigDecimal newAmount) {
        this.amount = newAmount;
    }
}
