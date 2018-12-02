package com.vis.demo.controllers;

import com.vis.demo.dto.SubscriptionDto;
import com.vis.demo.model.Customer;
import com.vis.demo.model.Subscription;
import com.vis.demo.services.Implemetation.AccountServiceImpl;
import com.vis.demo.services.Interfaces.AccountService;
import com.vis.demo.services.Interfaces.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/make")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/subscription", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void createSubscription(HttpSession session, @RequestBody SubscriptionDto subscriptionDto){
        Customer customer = accountService.getCustomerByEmail((String) session.getAttribute("email"));
        subscriptionService.saveNewSubscription(new Subscription(customer.getCid(),subscriptionDto.getBookId()));
    }



}
