package com.vis.demo.XmlManager;

import com.vis.demo.model.Subscription;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class SubscriptionManager {

    private List<Subscription> subscriptions = null;

    public SubscriptionManager() {
    }

    public SubscriptionManager(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @XmlElement(name="subscription")
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
