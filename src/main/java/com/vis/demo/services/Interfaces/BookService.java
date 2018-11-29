package com.vis.demo.services.Interfaces;

import com.vis.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> findBookByTerm(String term);
//    List<Book> getAllBooks();
    Book findBookById(long id);

}
