package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractionResult = calculator.subtraction(a, b);
        assertEquals(-3, subtractionResult);
    }

    @Test
    public void testPowerOf2() {
        Calculator calculator = new Calculator();
        int a = 5;
        double powerOf2Result = calculator.powerOf2(a);
        assertEquals(25, powerOf2Result, 0.01);
    }
}
