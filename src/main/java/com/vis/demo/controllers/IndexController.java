package com.vis.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        ModelAndView mav = new ModelAndView("index");

        if (session.getAttribute("loggedIn") != null){
            mav.addObject("loggedIn", true);
        } else {
            mav.addObject("loggedIn", false);
        }
        return mav;
    }

    @GetMapping("/formpage")
    public ModelAndView formPage(HttpSession session) {
        ModelAndView mav = new ModelAndView("form");

        if (session.getAttribute("loggedIn") != null){
            mav.addObject("loggedIn", true);
        } else {
            mav.addObject("loggedIn", false);
        }
        return mav;
    }
}
