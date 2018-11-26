package com.vis.demo.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public abstract class HibernateDao {

    HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    protected SessionFactory getSessionFactory() {
        return hibernateTemplate.getSessionFactory();
    }

    protected Session getSession() {
        try {
            return getSessionFactory().getCurrentSession();
        } catch (HibernateException e) {
            System.out.println("Cannot get a Hibernate session. You are missing a transaction. \" +\n" +
                    "                    \"Look at the stack trace and add @Transactional somewhere (a service/DAO).\"," + e);
            throw e;
        }
    }
}