package com.vis.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

// to xml
public class Subscription {
    private long sid;
    private Customer customer;
    private Book book;

    public Subscription() {
    }

    public Subscription(LocalDate endDateOfReservation, Customer customer, Book book) {
        this.customer = customer;
        this.book = book;
    }

    public long getId() {
        return sid;
    }

    public void setId(long id) {
        this.sid = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
