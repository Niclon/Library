package com.vis.demo.StorageConverters;

import com.vis.demo.XmlManager.ReservationManager;
import com.vis.demo.model.Reservation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReservationManagerXmlConverter {

    public static void addReservationToStorage(Reservation reservation)
    {
        try {

            ReservationManager manager = getReservationManagerFromStorage();

//            List<Reservation> reservationList = new ArrayList<>();
////            reservationList.add(reservation);
//            ReservationManager manager = new ReservationManager(reservationList);

            manager.getReservations().add(reservation);
            saveReservationManagerToStorage(manager);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ReservationManager getReservationManagerFromStorage(){
        File xmlFile = new File("src\\main\\resources\\XMLStorage\\reservationManager.xml" );
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( ReservationManager.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (ReservationManager) jaxbUnmarshaller.unmarshal( xmlFile );
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println("Manager from storage is null");
        return null;
    }
    private static void saveReservationManagerToStorage(ReservationManager manager){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReservationManager.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            jaxbMarshaller.marshal(manager, new File("src\\main\\resources\\XMLStorage\\reservationManager.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
