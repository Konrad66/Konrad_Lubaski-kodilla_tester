package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 8;
        int base = 2;
        int exponent = 3;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(12, sumResult);
        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum działa niepoprawnie dla liczb " + a + " i " + b);
        }

        int subtractionResult = calculator.subtraction(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractionResult);
        if(correct2){
            System.out.println("Metoda subtraction dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtraction dziala niepoprawnie dla liczb " + a + " i " + b);
        }


        int powerOf2Result = calculator.powerOf2(base, exponent);
        boolean correct3 = ResultChecker.assertEquals(8,powerOf2Result);
        if(correct3){
            System.out.println("Metoda exponentiation dziala poprawnie dla podstawy " + base + " i dla wykładnika " + exponent);
        } else {
            System.out.println("Metoda exponentiation dziala niepoprawnie dla podstawy " + base + " i dla wykładnika " + exponent);
        }

        int divisionResult = calculator.division(a, b);
        boolean correct4 = ResultChecker.assertEquals(2,divisionResult);
        if(correct4){
            System.out.println("Metoda division dziala poprawnie dla liczby " + a + " i " + b);
        } else {
            System.out.println("Metoda division dziala niepoprawnie dla liczby " + a + " i " + b);
        }
    }
}