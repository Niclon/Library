package com.vis.demo.classes;

import java.util.List;

public class Employe extends Customer {
    public boolean employe;

    public boolean isEmploye() {
        return employe;
    }

    public void setEmploye(boolean employe) {
        this.employe = employe;
    }

    public Employe(String name, String surname, String email, String login, String password) {
        super(name, surname, email, login, password);
    }

    public void returnABook(Customer customer,String nameOfBook){
//todo
    }

    public List<Debt> showDebts(Customer customer){
        return null;
//        todo
    }
}
