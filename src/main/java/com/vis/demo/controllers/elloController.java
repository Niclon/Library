package com.vis.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
public class elloController {

    // inject via application.properties
    private String message = "Hello World";


    @GetMapping("/ello")
        public String welcome(Map<String, Object> model) {
            model.put("message", this.message);
            return "ello";
        }



    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView loginAsAnotherUser()  {


        return new ModelAndView("redirect:/pages/index.html");

    }
}
