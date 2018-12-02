package com.vis.demo.StorageConverters;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import com.vis.demo.XmlManager.ReservationManager;
import com.vis.demo.XmlManager.SubscriptionManager;
import com.vis.demo.model.AbstractPerson;
import com.vis.demo.model.Reservation;
import com.vis.demo.model.Subscription;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionManagerXmlConverter {

    public static void addSubscriptionToStorage(Subscription subscription)
    {
        try {
            SubscriptionManager manager = getSubscriptionManagerFromStorage();

//            List<Subscription> subscriptionList = new ArrayList<>();
////            subscriptionList.add(subscription);
//            SubscriptionManager manager = new SubscriptionManager(subscriptionList);

            manager.getSubscriptions().add(subscription);
            saveSubscriptionManagerToStorage(manager);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static SubscriptionManager getSubscriptionManagerFromStorage(){
        File xmlFile = new File("src\\main\\resources\\XMLStorage/subscriptionManager.xml" );
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( SubscriptionManager.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (SubscriptionManager) jaxbUnmarshaller.unmarshal( xmlFile );
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println("Manager from storage is null");
        return null;
    }
    private static void saveSubscriptionManagerToStorage(SubscriptionManager manager){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SubscriptionManager.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            jaxbMarshaller.marshal(manager, new File("src\\main\\resources\\XMLStorage\\subscriptionManager.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
