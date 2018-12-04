package com.vis.demo.services.Implemetation;

import com.vis.demo.dao.OrderDao;
import com.vis.demo.dto.OrderDetailDto;
import com.vis.demo.services.Interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public OrderDetailDto getLastOrderDetail(long userId) {

        return orderDao.getOrderDetailForUser(userId);
    }
}
