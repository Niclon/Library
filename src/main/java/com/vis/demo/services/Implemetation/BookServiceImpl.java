package com.vis.demo.services.Implemetation;

import com.vis.demo.model.Book;
import com.vis.demo.services.Interfaces.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public List<Book> tempBooks = tempCreateBooks();
    @Override
    public List<Book> findBookByTerm(String term) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.tempBooks;
    }

    @Override
    public Book findBookById(int id) {
//        todo its for test
        return this.tempBooks.get(id);
    }

    public List<Book> tempCreateBooks(){
        List<Book> temp = new ArrayList<>();
        temp.add(new Book("1","Pán prstenů", "J.R.R. Tolkien","toto je trilogie pána prstenů."));
        temp.add(new Book("2","Raz Dva", "Pepa Barot","Toto je kniha o důvodech proč brát věci postupně."));
        temp.add(new Book("3","Příběhy líného studenta Petra", "Petr Vychodil","Tato kniha zobrazuje studiumm Petra na Vysoké škole báňské."));
        return temp;
    }
}
