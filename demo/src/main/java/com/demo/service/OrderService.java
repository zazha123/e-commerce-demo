package com.demo.service;

import com.demo.error.BusinessException;
import com.demo.service.model.OrderModel;

public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;

}
