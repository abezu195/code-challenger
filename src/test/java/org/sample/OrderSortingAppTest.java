package org.sample;

import org.junit.Assert;
import org.junit.Test;
import org.sample.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderSortingAppTest {

    private final List<Order> unorderedOrders = List.of(
            new Order(1L, "John", "Doe", 129.99, LocalDate.of(2021, 11, 30), 4.1),
            new Order(2L, "Marie", "Jane", 409.98, LocalDate.of(2024, 3, 2), 4.96),
            new Order(3L, "Chris", "Bjorn", 409.97, LocalDate.of(2024, 10, 15), 3.1),
            new Order(4L, "Anthony", "Parker", 95.00, LocalDate.of(2024, 10, 15), 2.5),
            new Order(5L, "Alex", "Doorbell", 95.99, LocalDate.of(2023, 2, 9), 1.5),
            new Order(6L, "John", "Smith", 9.99, LocalDate.of(2024, 5, 21), 5.0),
            new Order(7L, "Will", "Spark", 213.59, LocalDate.of(2024, 4, 16), 3.5),
            new Order(8L, "Grace", "Bellingham", 99.99, LocalDate.of(2024, 6, 12), 3.5),
            new Order(9L, "Emma", "Price", 314.00, LocalDate.of(2025, 7, 8), 3.51),
            new Order(10L, "Olivia", "Khan", 95.99, LocalDate.of(2024, 12, 19), 3.49)
    );

    @Test
    public void sort_whenSortingByPrice_shouldReturnTheOrdersSortedByPrice() {
        //given
        //TODO: finish up the test setup

        //when
        List<Order> orderedOrders = new ArrayList<>();

        //then
        Assert.assertEquals(orderedOrders, List.of(
                new Order(6L, "John", "Smith", 9.99, LocalDate.of(2024, 5, 21), 5.0),
                new Order(4L, "Anthony", "Parker", 95.00, LocalDate.of(2024, 10, 15), 2.5),
                new Order(5L, "Alex", "Doorbell", 95.99, LocalDate.of(2023, 2, 9), 1.5),
                new Order(10L, "Olivia", "Khan", 95.99, LocalDate.of(2024, 12, 19), 3.49),
                new Order(8L, "Grace", "Bellingham", 99.99, LocalDate.of(2024, 6, 12), 3.5),
                new Order(1L, "John", "Doe", 129.99, LocalDate.of(2021, 11, 30), 4.1),
                new Order(7L, "Will", "Spark", 213.59, LocalDate.of(2024, 4, 16), 3.5),
                new Order(9L, "Emma", "Price", 314.00, LocalDate.of(2025, 7, 8), 3.51),
                new Order(3L, "Chris", "Bjorn", 409.97, LocalDate.of(2024, 10, 15), 3.1),
                new Order(2L, "Marie", "Jane", 409.98, LocalDate.of(2024, 3, 2), 4.96)
        ));
    }

    @Test
    public void sort_whenSortingByDateDesc_shouldReturnTheOrdersSortedByDateDesc() {
        //given
        //TODO: finish up the test setup

        //when
        List<Order> orderedOrders = new ArrayList<>();

        //then
        Assert.assertEquals(orderedOrders, List.of(
                new Order(9L, "Emma", "Price", 314.00, LocalDate.of(2025, 7, 8), 3.51),
                new Order(10L, "Olivia", "Khan", 95.99, LocalDate.of(2024, 12, 19), 3.49),
                new Order(3L, "Chris", "Bjorn", 409.97, LocalDate.of(2024, 10, 15), 3.1),
                new Order(4L, "Anthony", "Parker", 95.00, LocalDate.of(2024, 10, 15), 2.5),
                new Order(8L, "Grace", "Bellingham", 99.99, LocalDate.of(2024, 6, 12), 3.5),
                new Order(6L, "John", "Smith", 9.99, LocalDate.of(2024, 5, 21), 5.0),
                new Order(7L, "Will", "Spark", 213.59, LocalDate.of(2024, 4, 16), 3.5),
                new Order(2L, "Marie", "Jane", 409.98, LocalDate.of(2024, 3, 2), 4.96),
                new Order(5L, "Alex", "Doorbell", 95.99, LocalDate.of(2023, 2, 9), 1.5),
                new Order(1L, "John", "Doe", 129.99, LocalDate.of(2021, 11, 30), 4.1)
        ));
    }

    @Test
    public void sort_whenSortingByRatingAsc_shouldReturnTheOrdersSortedByRatingAsc() {
        //given
        //TODO: finish up the test setup

        //when
        List<Order> orderedOrders = new ArrayList<>();

        //then
        Assert.assertEquals(orderedOrders, List.of(
                new Order(5L, "Alex", "Doorbell", 95.99, LocalDate.of(2023, 2, 9), 1.5),
                new Order(4L, "Anthony", "Parker", 95.00, LocalDate.of(2024, 10, 15), 2.5),
                new Order(3L, "Chris", "Bjorn", 409.97, LocalDate.of(2024, 10, 15), 3.1),
                new Order(10L, "Olivia", "Khan", 95.99, LocalDate.of(2024, 12, 19), 3.49),
                new Order(7L, "Will", "Spark", 213.59, LocalDate.of(2024, 4, 16), 3.5),
                new Order(8L, "Grace", "Bellingham", 99.99, LocalDate.of(2024, 6, 12), 3.5),
                new Order(9L, "Emma", "Price", 314.00, LocalDate.of(2025, 7, 8), 3.51),
                new Order(1L, "John", "Doe", 129.99, LocalDate.of(2021, 11, 30), 4.1),
                new Order(2L, "Marie", "Jane", 409.98, LocalDate.of(2024, 3, 2), 4.96),
                new Order(6L, "John", "Smith", 9.99, LocalDate.of(2024, 5, 21), 5.0)
        ));
    }

}
