package com.vis.demo.dao;

import com.vis.demo.dto.OrderDetailDto;

public interface OrderDao {
    OrderDetailDto getOrderDetailForUser(long userId);
}
