package com.vis.demo.dao.impl;

import com.vis.demo.dao.BookDao;
import com.vis.demo.dao.HibernateDao;
import com.vis.demo.model.Book;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl extends HibernateDao implements BookDao {
    public List<Book> findBookByTerm(String term) {
        Criteria bookCriteria = getSession().createCriteria(Book.class).add(Restrictions.ilike("name", term + "%"));
        return bookCriteria.list();
    }

    @Override
    public Book findBookById(long id) {
        Criteria bookCriteria = getSession().createCriteria(Book.class).add(Restrictions.eq("id", id));
        return (Book) bookCriteria.list().get(0);
    }
}
