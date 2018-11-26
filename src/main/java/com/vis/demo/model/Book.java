package com.vis.demo.model;


import javax.persistence.*;

@Entity
@Table(schema = "db_vis", name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long bid;
    private String name;
    private String autor;
    @Column(length = 800)
    private String description;

    public Book() {
    }

    public Book(Long id, String name, String autor, String description) {
        this.bid = id;
        this.name = name;
        this.autor = autor;
        this.description = description;
    }

    public void setId(Long id) {
        this.bid = id;
    }

    public Long getId() {
        return bid;
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
