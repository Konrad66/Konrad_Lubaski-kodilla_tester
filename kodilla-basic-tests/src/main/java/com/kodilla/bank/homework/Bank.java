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

    public int payoutsFromCashMachines(){
        int numberOfPayoutsFromCashMachines = 0;
        for (int i = 0; i < numberOfCashMachines; i++){
            if(cashMachines[i].getNumberOfPayoutsTransactions() > 0){
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

    public double averageOfPayoutsFromCashMachines(){
        double sum = 0;
        int numberOfTransaction = 0;
        for(int i = 0; numberOfCashMachines > i; i++){
            if(cashMachines[i].getAverageOfPayouts() < 0){
                sum += cashMachines[i].getAverageOfPayouts();
                numberOfTransaction++;
            }
        }
        return sum / numberOfTransaction;
    }

    public double averageOfPaymentsFromCashMachines(){
        double sum = 0;
        int numberOfTransaction = 0;
        for(int i = 0; numberOfCashMachines > i; i++){
            if(cashMachines[i].getAverageOfPayments() > 0){
                sum += cashMachines[i].getAverageOfPayments();
                numberOfTransaction++;
            }
        }
        return sum / numberOfTransaction;
    }

}