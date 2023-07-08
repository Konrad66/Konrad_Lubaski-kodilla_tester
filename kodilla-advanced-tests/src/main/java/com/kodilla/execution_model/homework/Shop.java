package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private Item item;

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public double priceOfAllOrders(){
        return item.getPrice();
    }

    public int getSize(){
        return this.orders.size();
    }

}
