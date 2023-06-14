package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int powerOf2(int base, int exponent) {
       int result = 1;
       for (int i = 0; i < exponent; i++){
           result *= base;
       }
        return result;
    }

    public int division(int a, int b) {
        return b / a;
    }
}
