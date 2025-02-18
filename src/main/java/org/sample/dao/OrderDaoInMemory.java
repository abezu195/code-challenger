package org.sample.dao;

import org.sample.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoInMemory implements OrderDao {

    private final List<Order> orders = new ArrayList<>();

    public OrderDaoInMemory() {
        initDefaultInMemoryOrders();
    }

    private void initDefaultInMemoryOrders() {
        orders.add(new Order(1L, "John", "Doe", 129.99, LocalDate.of(2021, 11, 30), 4.1));
        orders.add(new Order(2L, "Marie", "Jane", 409.98, LocalDate.of(2024, 3, 2), 4.96));
        orders.add(new Order(3L, "Chris", "Bjorn", 409.97, LocalDate.of(2024, 10, 15), 3.1));
        orders.add(new Order(4L, "Anthony", "Parker", 95.00, LocalDate.of(2024, 10, 15), 2.5));
        orders.add(new Order(5L, "Alex", "Doorbell", 95.99, LocalDate.of(2023, 2, 9), 1.5));
        orders.add(new Order(6L, "John", "Smith", 9.99, LocalDate.of(2024, 5, 21), 5.0));
        orders.add(new Order(7L, "Will", "Spark", 213.59, LocalDate.of(2024, 4, 16), 3.5));
        orders.add(new Order(8L, "Grace", "Bellingham", 99.99, LocalDate.of(2024, 6, 12), 3.5));
        orders.add(new Order(9L, "Emma", "Price", 314.00, LocalDate.of(2025, 7, 8), 3.51));
        orders.add(new Order(10L, "Olivia", "Khan", 95.99, LocalDate.of(2024, 12, 19), 3.49));
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }
}