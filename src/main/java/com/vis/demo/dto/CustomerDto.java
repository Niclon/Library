package com.vis.demo.dto;

public class CustomerDto {
    public long cid;
    public String name;
    public String surname;
    public String email;
    public String login;

    public CustomerDto() {
    }

    public CustomerDto(long cid, String name, String surname, String email, String login) {
        this.cid = cid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
