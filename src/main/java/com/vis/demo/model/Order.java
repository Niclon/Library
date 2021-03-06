package com.vis.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "db_vis", name = "orders" )
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long oid;
    public LocalDate bookOrderDate;
    public LocalDate exceptedBookOrderReturnDate;
    public LocalDate bookOrderReturnDate;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="bid")
    public Book book;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cid")
    public Customer customer;


    public Order() {
    }

    public Order(LocalDate bookOrderDate, LocalDate exceptedBookOrderReturnDate, LocalDate bookOrderReturnDate) {
        this.bookOrderDate = bookOrderDate;
        this.exceptedBookOrderReturnDate = exceptedBookOrderReturnDate;
        this.bookOrderReturnDate = bookOrderReturnDate;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public LocalDate getBookOrderDate() {
        return bookOrderDate;
    }

    public void setBookOrderDate(LocalDate bookOrderDate) {
        this.bookOrderDate = bookOrderDate;
    }

    public LocalDate getExceptedBookOrderReturnDate() {
        return exceptedBookOrderReturnDate;
    }

    public void setExceptedBookOrderReturnDate(LocalDate exceptedBookOrderReturnDate) {
        this.exceptedBookOrderReturnDate = exceptedBookOrderReturnDate;
    }

    public LocalDate getBookOrderReturnDate() {
        return bookOrderReturnDate;
    }

    public void setBookOrderReturnDate(LocalDate bookOrderReturnDate) {
        this.bookOrderReturnDate = bookOrderReturnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
