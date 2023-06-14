package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 8;
        int subtractionResult = calculator.subtraction(a, b);
        assertEquals(-3, subtractionResult);
    }

    @Test
    public void testPowerOfForValueLargerThen0() {
        int base = 4;
        int exponent = 2;
        double powerOf2Result = calculator.powerOf2(base, exponent);
        assertEquals(16, powerOf2Result, 0.01);
    }

    @Test
    public void testPowerOfForValueLessThen0(){
        int base = -2;
        int exponent = 1;
        double powerOf2Result = calculator.powerOf2(base, exponent);
        assertEquals(-2, powerOf2Result, 0.01);
    }


    @Test
    public void testPowerOfFor0(){
        int base = 0;
        int exponent = 0;
        double powerOf2Result = calculator.powerOf2(base, exponent);
        assertEquals(1, powerOf2Result, 0.01);
    }
}
