package com.vis.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

// to xml
public class Reservation {
    private long rid;
    public LocalDate EndDateOfReservation;
    private Customer customer;
    private Book book;

    public Reservation() {
    }

    public Reservation(LocalDate endDateOfReservation, Customer customer, Book book) {
        EndDateOfReservation = endDateOfReservation;
        this.customer = customer;
        this.book = book;
    }

    public long getId() {
        return rid;
    }

    public void setId(long id) {
        this.rid = id;
    }

    public LocalDate getEndDateOfReservation() {
        return EndDateOfReservation;
    }

    public void setEndDateOfReservation(LocalDate endDateOfReservation) {
        EndDateOfReservation = endDateOfReservation;
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
