package com.vis.demo.model;

import com.vis.demo.XmlIdGenerator;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement
public class Subscription {
    private long sid;
    private long cid;
    private long bid;

    public Subscription() {
    }

    public Subscription(long cid, long bid) {
        this.sid = XmlIdGenerator.getNewSid();
        this.cid = cid;
        this.bid = bid;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
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
