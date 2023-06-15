package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachine; //= new CashMachine[];


    public Bank(int numberOfCashMachines) {
        cashMachine = new CashMachine[numberOfCashMachines];
    }

    public int getNumberOfCashMachine() {
        return cashMachine.length;
    }



    public double balanceFromAllCashMachine() {
        double sum = 0;
        for (int i = 0; i > cashMachine.length; i++) {
            sum += cashMachine.length;
        }
        return sum;
    }

//zrobić metode w której przechodze przez tablicę i zwracam sumę elemntów tablicy


}
