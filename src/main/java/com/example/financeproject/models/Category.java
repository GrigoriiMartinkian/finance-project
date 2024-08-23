package com.example.financeproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    private long id;
    private long type;
    private String name;

    @ManyToOne
    @JoinColumn(name = "categoriesList_id", nullable = false)
    private CategoriesList categoriesList;
}
