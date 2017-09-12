package com.abdul.ecommerce.repo.impl;

import com.abdul.ecommerce.repo.OrderDetailsDao;
import com.abdul.ecommerce.model.OrderDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by abdul on 9/2/17.
 */
@Repository
@Transactional
public class OrderDetailsDaoImpl implements OrderDetailsDao {
    @PersistenceContext
    private EntityManager entityManager;

    public OrderDetails getOrderDetails(int id){
        OrderDetails orderDetails = entityManager.find(OrderDetails.class, id);
        return orderDetails;
    }

    public List<OrderDetails> getAllOrders(){
        Query allOrders = entityManager.createQuery("select o from OrderDetails o");
        List<OrderDetails> orders = allOrders.getResultList();
        return orders;
    }

    public void createOrder(OrderDetails orderDetails){
        entityManager.persist(orderDetails);
    }

    public void updateOrder(OrderDetails orderDetails){
        entityManager.merge(orderDetails);
    }

    public void deleteOrder(OrderDetails orderDetails){
        entityManager.remove(orderDetails);
    }
}
