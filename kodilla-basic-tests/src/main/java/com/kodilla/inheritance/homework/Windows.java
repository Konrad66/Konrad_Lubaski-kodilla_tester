package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{

    public Windows(int yearProduction){
        super(yearProduction);
    }

    @Override
    public void turnOn(){
        System.out.println("Windows turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("Windows turn off");
    }



}
