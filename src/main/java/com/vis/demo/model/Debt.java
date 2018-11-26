package com.vis.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

//to XML
public class Debt {
    public long did;
    public LocalDate dateOfPay;
    public int money;

    public Debt() {
    }

    public Debt(long did, LocalDate dateOfPay, int money) {
        this.did = did;
        this.dateOfPay = dateOfPay;
        this.money = money;
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public LocalDate getDateOfPay() {
        return dateOfPay;
    }

    public void setDateOfPay(LocalDate dateOfPay) {
        this.dateOfPay = dateOfPay;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
