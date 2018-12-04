package com.vis.demo.controllers;

import com.vis.demo.dto.OrderDetailDto;
import com.vis.demo.services.Interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/getcustomerdetail/order/{userId}")
    public OrderDetailDto getLastOrder(@PathVariable("userId") String userId){
        return orderService.getLastOrderDetail(Long.parseLong(userId));
    }

}
