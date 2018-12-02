package com.vis.demo.controllers;

import com.vis.demo.dto.CustomerDto;
import com.vis.demo.services.Interfaces.AccountService;
import com.vis.demo.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CustomerRestController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/getcustomerdetail/{email}")
    public CustomerDto getCustomerDetail(@PathVariable("email") String email){
        return CustomerUtil.getCustomerDtoFromCustomer(accountService.getCustomerByEmail(email));
    }
}
