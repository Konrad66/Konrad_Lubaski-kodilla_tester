package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {

    @Test
    public void testWarehouseAppTestSuite() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        // when
        Order isOrderInWarehouse = warehouse.getOrder("123");
        //then
        assertTrue;
    }


    @Test
    public void testWarehouseAppTestSuite_WithException(){
        //givenn
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("245"));
    }


}