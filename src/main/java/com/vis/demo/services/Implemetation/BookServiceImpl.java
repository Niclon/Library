package com.vis.demo.services.Implemetation;

import com.vis.demo.dao.BookDao;
import com.vis.demo.model.Book;
import com.vis.demo.services.Interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

//    public List<Book> tempBooks = tempCreateBooks();
    @Override
    public List<Book> findBookByTerm(String term) {
        return bookDao.findBookByTerm(term);
    }

//    @Override
//    public List<Book> getAllBooks() {
//        return this.tempBooks;
//    }

    @Override
    public Book findBookById(long id) {
        return bookDao.findBookById(id);
    }

//    public List<Book> tempCreateBooks(){
//        List<Book> temp = new ArrayList<>();
//        temp.add(new Book(1L,"Pán prstenů", "J.R.R. Tolkien","toto je trilogie pána prstenů."));
//        temp.add(new Book(2L,"Raz Dva", "Pepa Barot","Toto je kniha o důvodech proč brát věci postupně."));
//        temp.add(new Book(3L,"Příběhy líného studenta Petra", "Petr Vychodil","Tato kniha zobrazuje studiumm Petra na Vysoké škole báňské."));
//        return temp;
//    }
}
