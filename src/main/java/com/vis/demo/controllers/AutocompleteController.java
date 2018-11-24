package com.vis.demo.controllers;

import com.vis.demo.dto.autocompleteDTO.AutocompleteRequestDto;
import com.vis.demo.dto.autocompleteDTO.AutocompleteResponseDto;
import com.vis.demo.model.Book;
import com.vis.demo.services.Interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/autocomplete")
public class AutocompleteController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book")
    public AutocompleteResponseDto autocompleteBook(@ModelAttribute AutocompleteRequestDto autocompleteRequestDto){

        List<Book> books = bookService.findBookByTerm(autocompleteRequestDto.getSearchTerm());
        return null;

    }

}
