package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);
        System.out.println(cars.length);
    }


    public static Car drawCar() {
        double drawnCarKind = RANDOM.nextInt(3);
        double a = getRandomSize();
        if (drawnCarKind == 0)
            return new Audi((int) a);
        else if (drawnCarKind == 1)
            return new Ford((int) a);
        else {
            return new Opel((int) a);
        }
    }

    private static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}
