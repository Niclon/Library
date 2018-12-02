package com.vis.demo.controllers;

import com.vis.demo.dto.CustomerDto;
import com.vis.demo.model.Debt;
import com.vis.demo.services.Interfaces.AccountService;
import com.vis.demo.services.Interfaces.DebtService;
import com.vis.demo.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

import static java.lang.Long.parseLong;

@RestController
public class CustomerRestController {

    @Autowired
    AccountService accountService;

    @Autowired
    DebtService debtService;

    @RequestMapping(value = "/getcustomerdetail/{email}")
    public CustomerDto getCustomerDetail(@PathVariable("email") String email){
        return CustomerUtil.getCustomerDtoFromCustomer(accountService.getCustomerByEmail(email));
    }

    @RequestMapping(value = "/getcustomerdetail/debts/{userId}")
    public Debt getCustomerDebts(@PathVariable("userId") String userId){
        return debtService.getDebtsForGivenUserId(parseLong(userId)).get(0);
    }
}
