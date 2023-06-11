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



        Job builder = new Builder(2500, "Building house");
        Person person = new Person("Konrad", 25, builder);
        person.displayResponsibilities();


        Job lawyer = new Lawyer(600, "knows the penal code.");
        Person person1 = new Person("Beata", 38, lawyer);
        person1.displayResponsibilities();
    }
}
