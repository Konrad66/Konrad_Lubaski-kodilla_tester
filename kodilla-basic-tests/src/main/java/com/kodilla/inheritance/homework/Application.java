package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {

    OperatingSystem operatingSystem = new OperatingSystem(2017);



    Windows windows = new Windows(1985);
    windows.displayYearProduction();
    windows.turnOn();
    windows.turnOff();

    Linux linux = new Linux(1991);
    linux.displayYearProduction();
    linux.turnOff();

    }
}