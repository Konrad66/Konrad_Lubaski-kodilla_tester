package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    @Override
    public void areaCalculation() {
        int a = 7;
        int b = 2;
        int result = a * b;
        System.out.println("Rectangle area equals: " + result);
    }

    @Override
    public void perimeterCalculation() {
        int a = 7;
        int b = 2;
        int result = (2 * a) + (2 * b);
        System.out.println("Rectangle area equals: " + result);
    }
}
