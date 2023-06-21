package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int transactionsCount;

    public CashMachine() {
        this.transactions = new double[0];
        this.transactionsCount = 0;
    }

    // metoda dodająca transakcje do Bankomatu
    public void addTransactions(double value) {
        this.transactionsCount++;
        double[] newTab = new double[this.transactionsCount];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.transactionsCount - 1] = value;
        this.transactions = newTab;
    }

    //metoda zwracajaca saldo bankomatu
    public double getBalance() {
        double balance = 0.0;
        for (int i = 0; i < transactionsCount; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    //metoda zwracająca liczbę transakcji związanych z wypłatą
    public int getNumberOfPayoutsTransactions(){
        int numberOfPayouts = 0;
        for (int i = 0; i < transactionsCount; i++){
            if (transactions[i] < 0){
                numberOfPayouts++;
            }
        }
        return numberOfPayouts;
    }

    //metoda zwracająca liczbę transakcji związaną z wpłatą pieniędzy,
    public int getNumberOfPaymentTransactions(){
        int numberOfPayments = 0;
        for(int i = 0; i < transactionsCount; i++){
            if(transactions[i] > 0){
                numberOfPayments++;
            }
        }
        return numberOfPayments;
    }

    //metoda zwracajaca srednia wartość wypłaty
    public double getAverageOfPayouts() {
        double sum = 0;
        int numberOfTransactions = 0;
        for (int i = 0; i < transactionsCount; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
                numberOfTransactions++;
            }
        }
        return sum / numberOfTransactions;
    }

    public double getAverageOfPayments() {
        double sum = 0;
        int numberOfTransactions = 0;
        for (int i = 0; i < transactionsCount; i++) {
            if (transactions[i] >= 0) {
                sum += transactions[i];
                numberOfTransactions++;
            }
        }
        return sum / numberOfTransactions;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public int getTransactionCount() {
        return transactionsCount;
    }
}