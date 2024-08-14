package com.example.financeproject.models;


public class Category {

    private final long id;
    private String name;
    private CategoryType type; // доход или расход

    public Category(long id, String name, CategoryType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Методы доступа
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CategoryType getType() {
        return type;
    }

    // Обновление имени категории
    public void updateName(String newName) {
        this.name = newName;
    }

}
