package com.kodilla.execution_model.homework;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Double.compare(order.price, price) == 0 && Objects.equals(time, order.time) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, time, login);
    }
}
