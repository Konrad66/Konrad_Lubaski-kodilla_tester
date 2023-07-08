package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {

    private double price;
    private Date time;
    private String login;

    public Order(double price, Date time, String login) {
        this.price = price;
        this.time = time;
        this.login = login;
    }

    public double getPrice() {
        return price;
    }

    public Date getTime() {
        return time;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", time='" + time + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
