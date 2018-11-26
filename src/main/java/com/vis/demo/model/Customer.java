package com.vis.demo.model;

import javax.persistence.*;

@Entity
@Table(schema = "db_vis", name = "customers" )
public class Customer extends AbstractPerson {
    public Customer() {
    }

    public Customer(String name, String surname, String email, String login, String password) {
        super(name, surname, email, login, password);
    }
}
