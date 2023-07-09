package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {

    private Item item;

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public double priceOfAllOrders() {
        return 0;
    }

    public int getNumberOfOrders() {
        return 0;
    }

    /*
    public List<Order> getOrderByRangeOfDate(Date startDate, Date endDate){
        return ;
    }

    public List<Order> getOrderByRangeOfMaxAndMin(double minPrice, double maxPrice){
        return ;
    }
*/


}
