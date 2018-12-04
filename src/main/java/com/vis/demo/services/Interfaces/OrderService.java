package com.vis.demo.services.Interfaces;

import com.vis.demo.dto.OrderDetailDto;

public interface OrderService {
    OrderDetailDto getLastOrderDetail(long userId);
}
