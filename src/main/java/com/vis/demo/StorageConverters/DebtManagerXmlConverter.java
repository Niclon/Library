package com.vis.demo.StorageConverters;

import com.vis.demo.XmlManager.DebtManager;
import com.vis.demo.XmlManager.ReservationManager;
import com.vis.demo.model.Debt;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DebtManagerXmlConverter {

    public static void addDebtToStorage(Debt debt){
//        DebtManager manager = getDebtManagerFromStorage();

            List<Debt> debtList = new ArrayList<>();
//            reservationList.add(reservation);
        DebtManager manager = new DebtManager(debtList);

        manager.getDebts().add(debt);
        saveDebtManagerToStorage(manager);
    }

    public static DebtManager getDebtManagerFromStorage(){
        File xmlFile = new File("src\\main\\resources\\XMLStorage\\debtManager.xml" );
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( DebtManager.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (DebtManager) jaxbUnmarshaller.unmarshal( xmlFile );
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println("Manager from storage is null");
        return null;
    }
    private static void saveDebtManagerToStorage(DebtManager manager){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DebtManager.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            jaxbMarshaller.marshal(manager, new File("src\\main\\resources\\XMLStorage\\debtManager.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
