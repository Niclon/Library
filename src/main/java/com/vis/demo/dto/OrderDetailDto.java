package com.vis.demo.dto;

import java.time.LocalDate;

public class OrderDetailDto {
    public String name;
    public String surname;
    public String bookName;
    public LocalDate dateOfExpectedReturn;

    public OrderDetailDto() {
    }

    public LocalDate getDateOfExpectedReturn() {
        return dateOfExpectedReturn;
    }

    public void setDateOfExpectedReturn(LocalDate dateOfExpectedReturn) {
        this.dateOfExpectedReturn = dateOfExpectedReturn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
