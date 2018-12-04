package com.vis.demo.dto;

import java.time.LocalDate;

public class OrderDetailDto {
    public String name;
    public String surname;
    public String bookName;
    public String dateOfExpectedReturn;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String name, String surname, String bookName, String dateOfExpectedReturn) {
        this.name = name;
        this.surname = surname;
        this.bookName = bookName;
        this.dateOfExpectedReturn = dateOfExpectedReturn;
    }

    public String getDateOfExpectedReturn() {
        return dateOfExpectedReturn;
    }

    public void setDateOfExpectedReturn(String dateOfExpectedReturn) {
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

    @Override
    public String toString() {
        return  "Jméno='" + name + '\'' +
                ", Přijmení='" + surname + '\'' +
                ", název knihy='" + bookName + '\'' +
                ", předpokládané vrácení='" + dateOfExpectedReturn + '\'';
    }
}
