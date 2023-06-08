package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.areaCalculation();
        square.perimeterCalculation();

        Triangle triangle = new Triangle();
        triangle.areaCalculation();
        triangle.perimeterCalculation();

        Rectangle rectangle = new Rectangle();
        rectangle.areaCalculation();
        rectangle.perimeterCalculation();

    }
}
