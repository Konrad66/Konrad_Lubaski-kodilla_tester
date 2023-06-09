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




        Builder builder = new Builder();
        Lawyer lawyer = new Lawyer();
        Person person = new Person("Konrad", 24, "Builder");
        person.displayFirsName();
        builder.displayResponsibilities();
        builder.displaySalary();
        Person person1 = new Person("Wiktoria", 21, "Lawyer");
        person1.displayFirsName();
        lawyer.displayResponsibilities();
        lawyer.displaySalary();
    }
}
