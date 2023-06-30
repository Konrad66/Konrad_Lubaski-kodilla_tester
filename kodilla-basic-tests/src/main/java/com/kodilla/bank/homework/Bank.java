package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines = new CashMachine[0];
    private int numberOfCashMachines;

    public Bank() {
        this.numberOfCashMachines = numberOfCashMachines = 0;
    }

    public void addNumberOfCashMachines(CashMachine cashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfCashMachines - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    //metoda zwracajaca balans z bankomatow
    public double balanceFromAllCashMachine() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getBalance();
        }
        return sum;
    }

    public int payoutsFromCashMachines() {
        int numberOfPayoutsFromCashMachines = 0;
        for (int i = 0; i < numberOfCashMachines; i++) {
            if (cashMachines[i].getNumberOfPayoutsTransactions() > 0) {
                numberOfPayoutsFromCashMachines++;
            }
        }
        return numberOfPayoutsFromCashMachines;
    }

    public int paymentsFromCashMachines() {
        int numberOfPaymentsFromCashMachines = 0;
        for (int i = 0; i < numberOfCashMachines; i++) {
            numberOfPaymentsFromCashMachines += cashMachines[i].getNumberOfPaymentTransactions();
        }
        return numberOfPaymentsFromCashMachines;
    }

    public double averageOfPayoutsFromCashMachines() {
        int numberOfPayoutsTransaction = 0;
        double sumOfPayouts = 0.0;
        for (int i = 0; i < numberOfCashMachines; i++) {
            int numberOfPayouts = cashMachines[i].getNumberOfPayoutsTransactions();
            numberOfPayoutsTransaction += numberOfPayouts;

            double[] transactions = cashMachines[i].getTransactions();

            for (int k = 0; k < transactions.length; k++) {
                if (transactions[k] < 0) {
                    sumOfPayouts += transactions[k];
                }
            }
        }
        return sumOfPayouts / numberOfPayoutsTransaction;
    }

    public double averageOfPaymentsFromCashMachines() {
        int numberOfPaymentsTransactions = 0;
        double sumOfPayments = 0.0;
        for (int i = 0; i < numberOfCashMachines; i++) {
            int numberOfPayments = cashMachines[i].getNumberOfPaymentTransactions();
            numberOfPaymentsTransactions += numberOfPayments;

            double[] transactions = cashMachines[i].getTransactions();

            for (int k = 0; k < transactions.length; k++) {
                if (transactions[k] > 0) {
                    sumOfPayments += transactions[k];
                }
            }
        }
        return sumOfPayments / numberOfPaymentsTransactions;
    }
}