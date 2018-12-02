package com.vis.demo.services.Implemetation;

import com.vis.demo.StorageConverters.ReservationManagerXmlConverter;
import com.vis.demo.model.Reservation;
import com.vis.demo.services.Interfaces.ReservationService;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public void saveNewReservation(Reservation reservation) {
        ReservationManagerXmlConverter.addReservationToStorage(reservation);
    }
}
