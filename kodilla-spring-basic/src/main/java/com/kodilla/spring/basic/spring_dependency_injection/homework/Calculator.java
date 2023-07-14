package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display displayValue;

    public Calculator(Display displayValue) {
        this.displayValue = displayValue;
    }

    public double add(double a, double b) {
        double result = a + b;
        return displayValue.display(result);
    }

    public double subtract(double a, double b) {
        double result = a - b;
        return displayValue.display(result);
    }

    public double multiply(double a, double b) {
        double result = a * b;
        return displayValue.display(result);
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("You can't divide by zero!");
        }
        double result = a / b;
        displayValue.display(result);
        return result;
    }
}