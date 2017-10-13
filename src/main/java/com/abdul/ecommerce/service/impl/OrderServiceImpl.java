package com.abdul.ecommerce.service.impl;

import com.abdul.ecommerce.repo.model.OrderDetails;
import com.abdul.ecommerce.repo.OrderDetailsDao;
import com.abdul.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by abdul on 9/2/17.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDetailsDao orderDetailsDao;

    @Override
    public void createOrder(OrderDetails orderDetails){
        orderDetailsDao.createOrder(orderDetails);
    }

    @Override
    public List getAllOrders(){
        List<OrderDetails> orders = orderDetailsDao.getAllOrders();
        return orders;
    }
}
