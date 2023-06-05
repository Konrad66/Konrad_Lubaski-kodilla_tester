package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{

    public Linux(int yearProduction){
        super(yearProduction);
    }

    @Override
    public void turnOn(){
        System.out.println("Linux turn on");
    }
    @Override
    public void turnOff(){
        System.out.println("Linux turn off");
    }

}
