package com.vis.demo.dao.impl;

import com.vis.demo.dao.HibernateDao;
import com.vis.demo.dao.OrderDao;
import com.vis.demo.dto.OrderDetailDto;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public class OrderDaoImpl extends HibernateDao implements OrderDao {
    @Override
    public OrderDetailDto getOrderDetailForUser(long userId) {

        List<Object[]> dataList = getSession().createNativeQuery("SELECT c.name, c.surname, b.name as bookname, o.exceptedBookOrderReturnDate from orders o inner join books b on b.bid=o.bid inner join customers c on c.cid=o.cid where o.bid=b.bid and o.cid=c.cid and o.cid=" + userId + " and o.bookOrderReturnDate is  null ").list();
        if (dataList == null){
            return null;
        }
        Object[] data = dataList.get(0);
//      celkem zvěrstvo
        return new OrderDetailDto((String) data[0],(String) data[1],(String) data[2],((Date) data[3]).toLocalDate().toString());

    }
}
//        List<Object[]> dataList = getSession().createNativeQuery("SELECT c.name, c.surname, b.name as bookname, o.exceptedBookOrderReturnDate from orders o inner join books b on b.bid=o.bid inner join customers c on c.cid=o.cid where o.bid=b.bid and o.cid=c.cid and o.cid=" + userId + " and o.bookOrderReturnDate is  null ").list();