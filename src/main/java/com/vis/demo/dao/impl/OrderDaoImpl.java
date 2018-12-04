package com.vis.demo.dao.impl;

import com.vis.demo.dao.HibernateDao;
import com.vis.demo.dao.OrderDao;
import com.vis.demo.dto.OrderDetailDto;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends HibernateDao implements OrderDao {
    @Override
    public OrderDetailDto getOrderDetailForUser(long userId) {

        getSession().createSQLQuery("SELECT {ord}.expectedBookOrderReturnDate, {cust}.name , {cust}.surname, {book}.name FROM orders {ord} ");
        return null;


//    List cats = getSession().createSQLQuery(
//            "SELECT {cat}.ID AS {cat.id}, {cat}.SEX AS {cat.sex}, " +
//                    "{cat}.MATE AS {cat.mate}, {cat}.SUBCLASS AS {cat.class}, ... " +
//                    "FROM CAT {cat} WHERE ROWNUM<10")
//            .addEntity("cat", cat.class)
//            .list()

    }
}
