package com.vis.demo.controllers;

import com.vis.demo.dto.autocompleteDTO.AutocompleteItemDto;
import com.vis.demo.dto.autocompleteDTO.AutocompleteRequestDto;
import com.vis.demo.dto.autocompleteDTO.AutocompleteResponseDto;
import com.vis.demo.model.Book;
import com.vis.demo.services.Interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/autocomplete")
public class AutocompleteController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books")
    public AutocompleteResponseDto autocompleteBooks(@ModelAttribute AutocompleteRequestDto autocompleteRequestDto){

        List<Book> books = bookService.findBookByTerm(autocompleteRequestDto.getSearchTerm());
        return null;

    }
    @RequestMapping(value = "/allbooks")
    public AutocompleteResponseDto getAllBooks(@ModelAttribute AutocompleteRequestDto autocompleteRequestDto){

        List<Book> books = bookService.getAllBooks();
        List<AutocompleteItemDto> result = new ArrayList<>();

        for (Book book:books) {
            result.add(new AutocompleteItemDto(book.getId(),book.getName()));
        }
        return new AutocompleteResponseDto(result);

    }

}
