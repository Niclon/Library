package com.vis.demo.controllers;

import com.vis.demo.dto.ReservationDto;
import com.vis.demo.dto.SubscriptionDto;
import com.vis.demo.model.Customer;
import com.vis.demo.model.Reservation;
import com.vis.demo.model.Subscription;
import com.vis.demo.services.Interfaces.AccountService;
import com.vis.demo.services.Interfaces.ReservationService;
import com.vis.demo.services.Interfaces.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequestMapping(value = "/make")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void createSubscription(HttpSession session, @RequestBody ReservationDto reservationDto){
        Customer customer = accountService.getCustomerByEmail((String) session.getAttribute("email"));
        reservationService.saveNewReservation(new Reservation(LocalDate.now(),customer.getCid(),reservationDto.getBookId()));
    }

}
