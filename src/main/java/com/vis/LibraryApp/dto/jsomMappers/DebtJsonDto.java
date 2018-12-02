package com.vis.LibraryApp.dto.jsomMappers;

import java.time.LocalDate;

public class DebtJsonDto {
    public long did;
    public long cid;
    public String dateOfPay;
    public int money;

    public DebtJsonDto() {
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getDateOfPay() {
        return dateOfPay;
    }

    public void setDateOfPay(String dateOfPay) {
        this.dateOfPay = dateOfPay;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "DebtJsonDto{" +
                "did=" + did +
                ", cid=" + cid +
                ", dateOfPay=" + dateOfPay +
                ", money=" + money +
                '}';
    }
}
