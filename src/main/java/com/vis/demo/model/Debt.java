package com.vis.demo.model;

import com.vis.demo.XmlIdGenerator;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Debt {
    public long did;
    @XmlElement(name="dateOfPay")
    public LocalDate dateOfPay;
    public int money;

    public Debt() {
    }

    public Debt( LocalDate dateOfPay, int money) {
        this.did =  XmlIdGenerator.getNewDid();
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
