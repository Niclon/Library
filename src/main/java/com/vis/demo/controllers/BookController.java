package com.vis.demo.controllers;

import com.vis.demo.model.Book;
import com.vis.demo.services.Interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/bookdetail/{bookId}", method = RequestMethod.GET)
    public ModelAndView getBookDetail(@PathVariable("bookId") String bookId, HttpSession session){
        ModelAndView mav = new ModelAndView();
//        todo change try catch
        try {
            if (session.getAttribute("loggedIn") == null){
                mav.addObject("disability","disabled");
            }
            Book book =  bookService.findBookById(Long.parseLong(bookId));
            mav.addObject("bookId",book.getId());
            mav.addObject("name",book.getName());
            mav.addObject("autor",book.getAutor());
            mav.addObject("description",book.getDescription());
//            "avalible"
            mav.setViewName("bookdetail");

        } catch (Exception e){
            mav.setViewName("redirect:/");
        }

        return mav;
    }




}
