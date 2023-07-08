package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop = new Shop();
    Order dress = new Order(100,"06.07.2023", "Wiktoria01");
    Order glasses = new Order(80, "01.07.2023", "kolomolo");
    Order table = new Order(350.0, "25.06.2023", "kurczak57");

    @BeforeEach
    public void setUp(){
        shop.addOrder(dress);
        shop.addOrder(glasses);
        shop.addOrder(table);
    }


    @Test
    public void testAddNewItem(){
        shop.addOrder(new Order(20, "25.05.2023", "user236"));
        assertEquals(4, shop.getSize());
    }

    @Test
    public void shouldReturnSizeOfOrders(){
        assertEquals(3, shop.getSize());
    }

    @Test
    public void shouldReturnSumOfAllOrders(){
        double sum = shop.priceOfAllOrders();

    }



}