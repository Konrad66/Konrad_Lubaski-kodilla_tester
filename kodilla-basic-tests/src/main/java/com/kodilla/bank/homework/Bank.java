package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachine = new CashMachine[2];
    CashMachine cashMachine2 = new CashMachine();


    public double balanceFromAllCashMachine(){
        double sum = 0;
        for(int i = 0; i > cashMachine.length; i++){
            sum += cashMachine.length;
        }
        return sum;
    }

//zrobić metode w której przechodze przez tablicę i zwracam sumę elemntów tablicy



}
