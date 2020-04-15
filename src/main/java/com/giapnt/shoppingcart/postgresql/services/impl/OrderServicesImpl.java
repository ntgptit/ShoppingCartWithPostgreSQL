package com.giapnt.shoppingcart.postgresql.services.impl;

import com.giapnt.shoppingcart.postgresql.constant.ContantsForBussines;
import com.giapnt.shoppingcart.postgresql.mapper.OrdersMapper;
import com.giapnt.shoppingcart.postgresql.model.Orders;
import com.giapnt.shoppingcart.postgresql.services.OrderServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("OrderServices")
@Transactional
public class OrderServicesImpl implements OrderServices {
    /**
     *
     */
    private static final Logger logger = LoggerFactory.getLogger(OrderServicesImpl.class);

    /**
     *
     */
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * @return orders
     */
    @Override
    @Transactional(readOnly = true)
    public List<Orders> getAllListOrder() {
        List<Orders> orders = null;
        try {
            orders = ordersMapper.selectAll();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return orders;
    }

    /**
     * @param id Input from UI
     * @return orders
     */
    @Override
    public Orders getOrderByPrimaryKey(long id) {
        Orders orders = null;
        try {
            orders = ordersMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return orders;

    }

    /**
     * @param orders Input from UI
     * @return result
     */
    @Override
    public Map<Integer, Object> modifyOrderByPrimaryKey(Orders orders) {
        Map<Integer, Object> result = null;
        List<Orders> listOrders;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        try {

            int checkUpdate = ordersMapper.updateByPrimaryKey(orders);
            listOrders = ordersMapper.selectAll();
            if (checkUpdate != 0) {
                mapOrders.put(checkUpdate, listOrders);
            } else {
                mapOrders.put(ContantsForBussines.DATA_NOT_MODIFIED, listOrders);
            }

            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * @param orders Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> addNewOrder(Orders orders) {
        Map<Integer, Object> result = null;
        List<Orders> listOrder;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        try {

            int checkInsert = ordersMapper.insert(orders);
            listOrder = ordersMapper.selectAll();
            if (checkInsert != 0) {
                mapOrders.put(checkInsert, listOrder);
            } else {
                mapOrders.put(ContantsForBussines.DATA_NOT_MODIFIED, listOrder);
            }

            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * @param orders Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> removeOrder(Orders orders) {
        Map<Integer, Object> result = null;
        HashMap<Integer, Object> mapOrders = new HashMap<>();
        int checkDelete;
        try {
            checkDelete = ordersMapper.deleteByPrimaryKey(orders.getId());
            List<Orders> listOrder = ordersMapper.selectAll();
            if (checkDelete != 0) {
                mapOrders.put(checkDelete, listOrder);
            } else {
                mapOrders.put(ContantsForBussines.DATA_NOT_MODIFIED, listOrder);
            }
            result = mapOrders;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }


}
