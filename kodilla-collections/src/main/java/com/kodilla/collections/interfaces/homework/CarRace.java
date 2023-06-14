package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Opel opel = new Opel(10);
        doRace(opel);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
