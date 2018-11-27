package com.vis.demo.dao;

import com.vis.demo.model.Book;

import java.util.List;

public interface BookDao {
    List<Book> findBookByTerm(String term);
    Book findBookById(long id);
}
