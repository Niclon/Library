package com.vis.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(schema = "db_vis", name = "employes" )
public class Employe extends AbstractPerson {
    public boolean employe;

    public boolean isEmploye() {
        return employe;
    }

    public void setEmploye(boolean employe) {
        this.employe = employe;
    }

    public Employe() {
    }

    public Employe(String name, String surname, String email, String login, String password) {
        super(name, surname, email, login, password);
    }
}
