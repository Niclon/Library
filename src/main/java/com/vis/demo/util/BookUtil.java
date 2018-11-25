package com.vis.demo.util;

import com.vis.demo.dto.BookDto;
import com.vis.demo.model.Book;

import javax.validation.constraints.NotNull;

public class BookUtil {
    public static BookDto toDto(@NotNull Book book){
        BookDto bookDto = new BookDto();
        // todo add book prop
        return bookDto;
    }
}
