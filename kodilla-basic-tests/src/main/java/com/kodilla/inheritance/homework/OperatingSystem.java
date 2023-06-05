package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int yearProduction;

    public OperatingSystem(int yearProduction){
        this.yearProduction = yearProduction;
    }

    public void turnOn(){
        System.out.println("System turn on");
    }

    public void turnOff(){
        System.out.println("System turn off");
    }

    public void displayYearProduction(){
        System.out.println("The system is from " + yearProduction);
    }

    public int getYearProduction(){
        return yearProduction;
    }
}
