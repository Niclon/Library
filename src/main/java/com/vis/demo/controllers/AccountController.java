package com.vis.demo.controllers;

import com.vis.demo.dto.LoginDto;
import com.vis.demo.services.Interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping(value = "account")
public class AccountController {

    @Autowired
    AccountService accountService;

    private static String LoggedIn = "loggedIn";

    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String login(HttpSession session, ModelMap modelMap) {


//
//        if(username.equalsIgnoreCase("acc1") && password.equalsIgnoreCase("123")) {
//            session.setAttribute("username", username);
//            return "account/success";
//        } else {
//            modelMap.put("error", "Invalid Account");
//            return "account/index";
//        }
        return "login";
    }
// todo create custom ajax on frontend
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView loginRequest(
            @RequestBody LoginDto loginDto,
            HttpSession session,
            ModelMap modelMap,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        ModelAndView mav = new ModelAndView();
        mav.addAllObjects(modelMap);
        if (accountService.checkIfEmailAndPasswordAreSame(loginDto)){
            session.setAttribute(LoggedIn,true);
            modelMap.addAttribute(LoggedIn,true);
            mav.setViewName("redirect:/");
            return mav;
        }
        modelMap.addAttribute(LoggedIn,false);
//        response.setStatus(401);
        mav.setStatus(HttpStatus.NOT_ACCEPTABLE);
        return mav;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        session.removeAttribute(LoggedIn);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public ModelAndView loginSuccess(HttpSession session, ModelMap modelMap) {
        session.setAttribute(LoggedIn,true);
        modelMap.addAttribute(LoggedIn,true);
        return new ModelAndView("index");
    }


}