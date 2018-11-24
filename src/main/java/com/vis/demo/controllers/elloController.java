package com.vis.demo.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class elloController {

    @GetMapping("/ello")
    public RedirectView redirectWithRedirectAttributes(RedirectAttributes attributes) {

        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectAttributes");
        attributes.addAttribute("attribute", "redirectWithRedirectAttributes");
        return new RedirectView("redirectedUrl");
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView loginAsAnotherUser()  {


        return new ModelAndView("redirect:/pages/index.html");

    }
}
