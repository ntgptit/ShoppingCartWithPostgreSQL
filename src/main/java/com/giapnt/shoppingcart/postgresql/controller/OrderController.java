package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.constant.Contants;
import com.giapnt.shoppingcart.postgresql.model.Orders;
import com.giapnt.shoppingcart.postgresql.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

@RestController
@RequestMapping("/rest")
public class OrderController {
    /**
     *
     */
    @Autowired
    private OrderServices orderServices;

    /**
     * @return result
     */
    @GetMapping(value = "/all-order")
    public ResponseEntity<Object> getAllOrder() {
        ResponseEntity<Object> result = null;
        List<Orders> orders;
        try {
            orders = orderServices.getAllListOrder();
            if (orders != null && !orders.isEmpty()) {
                result = new ResponseEntity<>(orders, HttpStatus.OK);
            }
        } catch (Exception e) {
            orders = emptyList();
        }
        if (result == null) {
            result = new ResponseEntity<>(orders, HttpStatus.NOT_FOUND);
        }
        return result;
    }

    /**
     * @param order order
     * @return result
     */
    @PostMapping(value = "/modify-order-information")
    public ResponseEntity<Object> modifyOrderInfomation(@Valid @RequestBody Orders order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrdersModify;
        try {
            mapOrdersModify = orderServices.modifyOrderByPrimaryKey(order);
            for (Map.Entry<Integer, Object> entry : mapOrdersModify.entrySet())
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapOrdersModify, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == Contants.DUPLICATE_NAME) {
                    result = new ResponseEntity<>(mapOrdersModify, HttpStatus.CONFLICT);
                    break;
                } else {
                    result = new ResponseEntity<>(mapOrdersModify, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapOrdersModify = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapOrdersModify, HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    /**
     * @param order order
     * @return result
     */
    @PostMapping(value = "/create-new-order")
    public ResponseEntity<Object> createNewOrders(@Valid @RequestBody Orders order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrdersCreate;
        try {
            mapOrdersCreate = orderServices.addNewOrder(order);
            for (Map.Entry<Integer, Object> entry : mapOrdersCreate.entrySet())
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapOrdersCreate, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == Contants.DUPLICATE_NAME) {
                    result = new ResponseEntity<>(mapOrdersCreate, HttpStatus.CONFLICT);
                    break;
                } else {
                    result = new ResponseEntity<>(mapOrdersCreate, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapOrdersCreate = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapOrdersCreate, HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    /**
     * @param order order
     * @return result
     */

    @PostMapping(value = "/remove-order")
    public ResponseEntity<Object> removeOrders(@Valid @RequestBody Orders order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrders;
        try {
            mapOrders = orderServices.removeOrder(order);
            for (Map.Entry<Integer, Object> entry : mapOrders.entrySet())
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapOrders, HttpStatus.NOT_MODIFIED);
                    break;
                } else {
                    result = new ResponseEntity<>(mapOrders, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapOrders = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapOrders, HttpStatus.BAD_REQUEST);
        }
        return result;
    }
}
