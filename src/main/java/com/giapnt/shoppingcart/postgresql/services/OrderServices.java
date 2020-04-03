package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Orders;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public interface OrderServices {

    /**
     * @return
     */
    List<Orders> getAllListOrder();

    /**
     * @param id
     * 
     * 
     * 
     * @return
     */
    Orders getOrderByPrimaryKey(long id);

    /**
     * @param orders
     * @return
     */
    Map<Integer, Object> modifyOrderByPrimaryKey(Orders orders);

    /**
     * @param orders
     * @return
     */
    Map<Integer, Object> addNewOrder(Orders orders);

    /**
     * @param orders
     * @return
     */
    Map<Integer, Object> removeOrder(Orders orders);
}
