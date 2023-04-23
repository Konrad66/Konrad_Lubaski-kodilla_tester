package com.kodilla;

import java.security.PublicKey;

public class Notebook {

    public int weight;
    public int price;
    public int year;
    public int ram;
    public String model;


    public Notebook(int weight, int price, int year, int ram, String model) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.ram = ram;
        this.model = model;
    }

    public void checkPrice() {
        if (this.price >= 1000) {
            System.out.println("This notebook is expensive.");
        } else if (this.price < 1000 && this.price > 600){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is very cheap.");
        }
    }

    public void checkWeight(){
        if(this.weight > 1500){
            System.out.println("The notebook is heavy.");
        } else if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("The weight is good.");
        } else {
            System.out.println("This notebook is light.");
        }
    }

    public void checkPriceandYear(){
        if(this.price > 1500 && this.year > 2021){
            System.out.println("It is very new notebook, but is very expensive.");
        } else if (this.year >= 2018 && (this.price <= 1500 && this.price >= 1000)){
            System.out.println("It is good notebook and price is not too high");
        } else {
            System.out.println("It is old notebook, but it is very cheap.");
        }
    }

    public void checkRam(){
        if(this.ram >= 32){
            System.out.println("This notebook is very fast.");
        } else if (this.ram < 32 || this.ram >= 16) {
            System.out.println("This notebook is fine.");
        } else {
            System.out.println("This notebook is very slow");
        }
    }
}
