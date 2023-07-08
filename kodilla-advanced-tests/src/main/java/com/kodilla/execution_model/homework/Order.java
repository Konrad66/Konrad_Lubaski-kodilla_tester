package com.kodilla.execution_model.homework;

public class Order {

    private double price;
    private String time;
    private String login;

    public Order(double price, String time, String login) {
        this.price = price;
        this.time = time;
        this.login = login;
    }

    public double getPrice() {
        return price;
    }

    public String getTime() {
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
