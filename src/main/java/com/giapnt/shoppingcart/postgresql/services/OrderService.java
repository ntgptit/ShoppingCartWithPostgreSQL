package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * The Interface OrderService.
 *
 * @author GiapNT
 */
@Service
@Transactional
public interface OrderService {

    /**
     * Gets the all list order.
     *
     * @return the all list order
     */
    List<Order> getAllListOrder();

    /**
     * Gets the order by primary key.
     *
     * @param id the id
     * @return the order by primary key
     */
    Order getOrderByPrimaryKey(long id);

    /**
     * Modify order by primary key.
     *
     * @param order the order
     * @return the map
     */
    Map<Integer, Object> modifyOrderByPrimaryKey(Order order);

    /**
     * Adds the new order.
     *
     * @param order the order
     * @return the map
     */
    Map<Integer, Object> addNewOrder(Order order);

    /**
     * Removes the order.
     *
     * @param order the order
     * @return the map
     */
    Map<Integer, Object> removeOrder(Order order);
}
