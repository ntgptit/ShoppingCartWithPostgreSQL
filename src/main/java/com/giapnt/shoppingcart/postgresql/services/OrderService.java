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
     * @return
     */
    List<Order> getAllListOrder();

    /**
     * @param id
     * @return
     */
    Order getOrderByPrimaryKey(long id);

    /**
     * @param order
     * @return
     */
    Map<Integer, Object> modifyOrderByPrimaryKey(Order order);

    /**
     * @param order
     * @return
     */
    Map<Integer, Object> addNewOrder(Order order);

    /**
     * @param order
     * @return
     */
    Map<Integer, Object> removeOrder(Order order);
}
