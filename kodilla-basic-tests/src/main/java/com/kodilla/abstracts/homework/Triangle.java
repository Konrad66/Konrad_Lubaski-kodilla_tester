package com.kodilla.abstracts.homework;

public class Triangle extends Shape {


    @Override
    public void areaCalculation() {
        int a = 4;
        int h = 5;
        int result = (a * h) / 2;
        System.out.println("Triangle area equals: " + result);
    }

    @Override
    public void perimeterCalculation() {
        int a = 4;
        int b = 5;
        int c = 6;
        int result = a + b + c;
        System.out.println("Triangle area equals: " + result);
    }
}
