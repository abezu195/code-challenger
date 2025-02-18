package org.sample.dao;

import org.sample.model.Order;

import java.util.List;

public interface OrderDao {
    List<Order> getAllOrders();
}
