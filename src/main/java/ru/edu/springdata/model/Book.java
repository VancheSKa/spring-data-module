package ru.edu.springdata.model;

public class Book {
    private Long id;
    private String name;
    private String language;
    private String category; // history, it, health etc...

    public Book() {
    }

    public Book(Long id,
                String name,
                String language,
                String category) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.category = category;
    }

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
