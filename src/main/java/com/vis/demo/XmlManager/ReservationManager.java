package com.vis.demo.XmlManager;

import com.vis.demo.model.Reservation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ReservationManager {

    private List<Reservation> reservations = null;

    public ReservationManager() {
    }

    public ReservationManager(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @XmlElement(name="reservation")
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
