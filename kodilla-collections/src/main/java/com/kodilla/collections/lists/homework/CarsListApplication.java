package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi(20));
        cars.add(new Opel(10));
        cars.add(new Opel(50));
        cars.add(new Audi(40));
        cars.add(new Ford(4));
        cars.add(new Ford(90));

        cars.remove(2);
        Audi audi = new Audi(40);
        cars.remove(audi);
        System.out.println("Our list has size: " + cars.size());

        for(Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
