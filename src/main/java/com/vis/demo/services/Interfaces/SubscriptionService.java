package com.vis.demo.services.Interfaces;

import com.vis.demo.model.Subscription;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

public interface SubscriptionService {
    void saveNewSubscription(Subscription subscription);
    List<Subscription> loadAllSubscription();
    List<Subscription> loadAllSubscriptionForGivenId(long id);
}
