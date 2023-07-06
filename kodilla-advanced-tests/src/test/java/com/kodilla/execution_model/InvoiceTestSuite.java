package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    private Invoice invoice = new Invoice();

    @BeforeEach
    public void setUp(){
        invoice.addItem(new Item("Pen", 10));
        invoice.addItem(new Item("Keyboard", 80));
        invoice.addItem(new Item("TV", 1500));
    }

    @Test
    public void shouldReturnSize3AfterAddNewItem(){
        assertEquals(3, invoice.getSize());
    }

    @Test
    public void s(){
        Item result = invoice.getItem(1);
        assertEquals("Keyboard", result.getName());
        assertEquals(80, result.getPrice(), 0.001);
    }

    @Test
    public void shouldReturnNullAfterGetItemOfMinusIndex(){
        assertEquals(null, invoice.getItem(-1) );
    }

    @Test
    public void shouldReturnNullAfterGetItemOutOfList(){
        assertEquals(null, invoice.getItem(4) );
    }

    @Test
    public void shouldReturn0SizeOfList(){
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

}