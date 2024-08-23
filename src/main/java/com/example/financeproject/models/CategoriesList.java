package com.example.financeproject.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoriesList")
public class CategoriesList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "categoriesList")
    private List<Category> categories;
}
