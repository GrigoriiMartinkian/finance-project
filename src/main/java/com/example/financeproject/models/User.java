package com.example.financeproject.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Relationships
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;
}
