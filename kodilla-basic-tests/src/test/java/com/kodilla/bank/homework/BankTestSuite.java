package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;

    public void setUp(){
        bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransactions(100.0);
        cashMachine1.addTransactions(20.0);
        cashMachine1.addTransactions(-60.0);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransactions(200.0);
        cashMachine2.addTransactions(-300.0);
        cashMachine2.addTransactions(20.0);

        bank.addNumberOfCashMachines(cashMachine1);
        bank.addNumberOfCashMachines(cashMachine2);
    }

    @Test // test sprawdzający całkowity bilans ze wszystkich banknotów
    public void shouldReturnBalanceFromAllCashMachine(){
        double expectedBalance = -20.0;
        double actualBalance = bank.balanceFromAllCashMachine();
        assertEquals(expectedBalance, actualBalance);
    }

    @Test //test sprawdzajacy liczbe transakcji zwiazanych z wyplata w bankomatach
    public void shouldReturnPayoutsFromCashMachines(){
        //gg
    }



}