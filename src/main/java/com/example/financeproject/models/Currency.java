package com.example.financeproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String code;
}