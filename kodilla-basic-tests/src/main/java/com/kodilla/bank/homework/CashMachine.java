package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    //private int size;
    private int transactionsCount;

    public CashMachine(){
        //this.size = 0;
        this.transactions = new double[0];
        this.transactionsCount = 0;
    }

    public void addTransactions(double value){
        double[] newTab = new double[this.transactionsCount];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.transactionsCount - 1] = value;
        this.transactions = newTab;
    }


    public double[] getTransactions(){
        return transactions;
    }

    public int getTransactionCount(){
        return transactionsCount;
    }

    public double getBalance(){
        double balance = 0.0;
        for(int i = 0; i < transactionsCount; i++){
            balance += transactions[i];
        }
        return balance;
    }

}