package com.vis.demo.model;

public class Book {
    private String id;
    private String name;
    private String autor;
    private String description;

    public Book(String id, String name, String autor, String description) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
