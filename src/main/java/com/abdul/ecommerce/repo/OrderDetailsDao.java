package com.abdul.ecommerce.repo;

import com.abdul.ecommerce.repo.model.OrderDetails;

import java.util.List;

/**
 * Created by abdul on 9/2/17.
 */
public interface OrderDetailsDao {
    void createOrder(OrderDetails orderDetails);
    void updateOrder(OrderDetails orderDetails);
    void deleteOrder(OrderDetails orderDetails);
    List<OrderDetails> getAllOrders();
}
