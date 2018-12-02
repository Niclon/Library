package com.vis.demo.model;

import com.vis.demo.XmlIdGenerator;
import com.vis.demo.adapters.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.time.LocalDate;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
    private long rid;
    @XmlElement(name="endDateOfReservation")
    public LocalDate endDateOfReservation;
    private long cid;
    private long bid;

    public Reservation() {
    }

    public Reservation(LocalDate endDateOfReservation, long cid, long bid) {
        rid=XmlIdGenerator.getNewRid();
        this.endDateOfReservation = endDateOfReservation;
        this.cid = cid;
        this.bid = bid;
    }

//    @XmlElement(name="endDateOfReservation")
    public LocalDate getEndDateOfReservation() {
        return endDateOfReservation;
    }

    public void setEndDateOfReservation(LocalDate endDateOfReservation) {
        this.endDateOfReservation = endDateOfReservation;
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }
}
