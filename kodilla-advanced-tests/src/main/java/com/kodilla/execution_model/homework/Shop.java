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
        double totalPrice = 0.0;
        for(Order order : orders){
            totalPrice += order.getPrice();
        }
        return totalPrice;
    }


    public int getNumberOfOrders() {
        return this.orders.size();
    }


    public List<Order> getOrderByRangeOfDate(Date startDate, Date endDate){
        List<Order> filteredOrder = new ArrayList<>();
        for(Order order : orders){
            if(order.getTime().after(startDate) && order.getTime().before(endDate)){
                filteredOrder.add(order);
            }
        }
        return filteredOrder;
    }

    public List<Order> getOrderByRangeOfMaxAndMin(double minPrice, double maxPrice){
        List<Order> filteredOrder = new ArrayList<>();
        for(Order order : orders){
            if(order.getPrice() >= minPrice && order.getPrice() <= maxPrice){
                filteredOrder.add(order);
            }
        }
        return filteredOrder;
    }




}
