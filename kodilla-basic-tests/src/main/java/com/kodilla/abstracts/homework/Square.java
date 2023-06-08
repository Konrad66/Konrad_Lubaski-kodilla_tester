package com.kodilla.abstracts.homework;

public class Square extends Shape{

    @Override
    public void areaCalculation() {
        int a = 4;
        int result = a * a;
        System.out.println("Square area equals: " + result);
    }

    @Override
    public void perimeterCalculation() {
        int a = 4;
        int result = 4 * a;
        System.out.println("Square perimeter equals: " + result);
    }
}
