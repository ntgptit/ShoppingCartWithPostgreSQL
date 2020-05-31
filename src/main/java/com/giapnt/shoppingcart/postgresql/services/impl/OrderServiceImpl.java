package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.mapper.OrderMapper;
import com.giapnt.shoppingcart.postgresql.model.Order;
import com.giapnt.shoppingcart.postgresql.services.OrderService;
import com.giapnt.shoppingcart.postgresql.ulltis.constant.AppServiceContants;

/**
 * The Class OrderServiceImpl.
 *
 * @author GiapNT
 */
@Service("OrderService")
@Transactional
public class OrderServiceImpl implements OrderService {

    /**
     * The Constant logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    /**
     * The order mapper.
     */
    @Autowired
    private OrderMapper orderMapper;

    /**
     * Gets the all list order.
     *
     * @return orders
     */
    @Override
    @Transactional(readOnly = true)
    public List<Order> getAllListOrder() {
        List<Order> order = null;
        try {
            order = orderMapper.selectAll();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return order;
    }

    /**
     * Gets the order by primary key.
     *
     * @param id Input from UI
     * @return orders
     */
    @Override
    public Order getOrderByPrimaryKey(long id) {
        Order order = null;
        try {
            order = orderMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return order;

    }

    /**
     * Modify order by primary key.
     *
     * @param order Input from UI
     * @return result
     */
    @Override
    public Map<Integer, Object> modifyOrderByPrimaryKey(Order order) {
        Map<Integer, Object> result = null;
        List<Order> listOrders;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        try {

            int checkUpdate = orderMapper.updateByPrimaryKey(order);
            listOrders = orderMapper.selectAll();
            if (checkUpdate != 0) {
                mapOrders.put(checkUpdate, listOrders);
            } else {
                mapOrders.put(AppServiceContants.DATA_NOT_MODIFIED, listOrders);
            }

            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * Adds the new order.
     *
     * @param order Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> addNewOrder(Order order) {
        Map<Integer, Object> result = null;
        List<Order> listOrder;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        try {

            int checkInsert = orderMapper.insert(order);
            listOrder = orderMapper.selectAll();
            if (checkInsert != 0) {
                mapOrders.put(checkInsert, listOrder);
            } else {
                mapOrders.put(AppServiceContants.DATA_NOT_MODIFIED, listOrder);
            }

            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * Removes the order.
     *
     * @param order Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> removeOrder(Order order) {
        Map<Integer, Object> result = null;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        int checkDelete;
        try {
            checkDelete = orderMapper.deleteByPrimaryKey(order.getId());
            List<Order> listOrder = orderMapper.selectAll();
            if (checkDelete != 0) {
                mapOrders.put(checkDelete, listOrder);
            } else {
                mapOrders.put(AppServiceContants.DATA_NOT_MODIFIED, listOrder);
            }
            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }


}
