package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

public class BankTestSuite {

    private CashMachine cashMachine = new CashMachine();
    //private Bank bank = new Bank();



    @Test // test sprawdzający całkowity bilans ze wszystkich banknotów
    public void shouldReturnBalanceFromAllCashMachine(){
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(100.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(-20.0);
        //double balanceFromAllCashMachine = bank.balanceFromAllCashMachine();
        //System.out.println("number of transaction" + balanceFromAllCashMachine);
    }
}
