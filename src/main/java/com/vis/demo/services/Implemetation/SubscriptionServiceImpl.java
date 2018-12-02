package com.vis.demo.services.Implemetation;

import com.vis.demo.StorageConverters.SubscriptionManagerXmlConverter;
import com.vis.demo.model.Subscription;
import com.vis.demo.services.Interfaces.SubscriptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public void saveNewSubscription(Subscription subscription) {
        SubscriptionManagerXmlConverter.addSubscriptionToStorage(subscription);
    }

    @Override
    public List<Subscription> loadAllSubscription() {
        return null;
    }

    @Override
    public List<Subscription> loadAllSubscriptionForGivenId(long id) {
        return null;
    }
}
