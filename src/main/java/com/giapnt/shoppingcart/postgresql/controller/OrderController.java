package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.constant.AppServiceContants;
import com.giapnt.shoppingcart.postgresql.model.Order;
import com.giapnt.shoppingcart.postgresql.services.OrderService;
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
    private OrderService orderService;

    /**
     * @return result
     */
    @GetMapping(value = "/all-order")
    public ResponseEntity<Object> getAllOrder() {
        ResponseEntity<Object> result = null;
        List<Order> order;
        try {
            order = orderService.getAllListOrder();
            if (order != null && !order.isEmpty()) {
                result = new ResponseEntity<>(order, HttpStatus.OK);
            }
        } catch (Exception e) {
            order = emptyList();
        }
        if (result == null) {
            result = new ResponseEntity<>(order, HttpStatus.NOT_FOUND);
        }
        return result;
    }

    /**
     * @param order order
     * @return result
     */
    @PostMapping(value = "/modify-order-information")
    public ResponseEntity<Object> modifyOrderInfomation(@Valid @RequestBody Order order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrdersModify;
        try {
            mapOrdersModify = orderService.modifyOrderByPrimaryKey(order);
            for (Map.Entry<Integer, Object> entry : mapOrdersModify.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapOrdersModify, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == AppServiceContants.DUPLICATE_NAME) {
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
    public ResponseEntity<Object> createNewOrders(@Valid @RequestBody Order order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrdersCreate;
        try {
            mapOrdersCreate = orderService.addNewOrder(order);
            for (Map.Entry<Integer, Object> entry : mapOrdersCreate.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapOrdersCreate, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == AppServiceContants.DUPLICATE_NAME) {
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
    public ResponseEntity<Object> removeOrders(@Valid @RequestBody Order order) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapOrders;
        try {
            mapOrders = orderService.removeOrder(order);
            for (Map.Entry<Integer, Object> entry : mapOrders.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
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
