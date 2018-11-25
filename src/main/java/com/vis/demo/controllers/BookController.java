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

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/bookdetail/{bookId}", method = RequestMethod.GET)
    public ModelAndView getBookDetail(@PathVariable("bookId") String bookId){
        ModelAndView mav = new ModelAndView();
//        todo change try catch
        try {
            Book book =  bookService.findBookById(Integer.parseInt(bookId));
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
