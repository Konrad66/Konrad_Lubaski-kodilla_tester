package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop = new Shop();
    Order dress = new Order(100.0, new Date(2023, 07, 4), "Wiktoria01");
    Order glasses = new Order(80.0, new Date(2023, 07, 5), "kolomolo");
    Order table = new Order(350.0, new Date(2023, 06, 23), "kurczak57");
    Order socks = new Order(35.5, new Date(2023, 05, 14), "wikiika47");

    @BeforeEach
    public void setUp() {
        shop.addOrder(dress);
        shop.addOrder(glasses);
        shop.addOrder(table);
    }


    @Test
    public void testAddNewItem() {
        shop.addOrder(new Order(20, new Date(2023, 05, 22), "user236"));
        assertEquals(5, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnListOfOrdersFromRangeOfTwoDays() {
        Date startDate = new Date(2023, 07, 4);
        Date endDate = new Date(2023, 07, 5 );

        List<Order> ordersByRange = shop.getOrderByRangeOfDate(startDate, endDate);
        assertEquals(2, ordersByRange.size());
        assertEquals(2, ordersByRange);
    }

    @Test
    public void ShouldReturnOrderWithMaxPrice() {
        List<Order> ordersByPriceRange = shop.getOrderByRangeOfMaxAndMin(500.0, 100.0);
        assertEquals(2, ordersByPriceRange.size());
        assertEquals(glasses, ordersByPriceRange.get(1));
        assertEquals(dress, ordersByPriceRange.get(0));
    }

    @Test
    public void shouldReturnSizeOfOrders() {
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnSumOfAllOrders() {
        double sum = shop.priceOfAllOrders();
        assertEquals(565.5, sum, 0.001);
    }
}