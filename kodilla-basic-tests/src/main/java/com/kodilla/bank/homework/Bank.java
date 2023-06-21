package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines = new CashMachine[0];
    private int numberOfCashMachines;

    public Bank(int numberOfCashMachines) {
        this.numberOfCashMachines = numberOfCashMachines = 0;
    }

    public void addNumberOfCashMachines(CashMachine cashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfCashMachines - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public double balanceFromAllCashMachine() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getBalance();
        }
        return sum;
    }

    public double payoutsFromCashMachines() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getNumberOfPayoutsTransactions();
        }
        return sum;
    }

    public double paymentsFromCashMachines() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getNumberOfPaymentTransactions();
        }
        return sum;
    }


}