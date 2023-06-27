package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;

    @BeforeEach
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
        assertEquals(expectedBalance, actualBalance, 0.001);
    }

    @Test //test sprawdzajacy liczbe transakcji zwiazanych z wyplata w bankomatach
    public void shouldReturnPayoutsFromCashMachines(){
        int expected = 2;
        int actual = bank.payoutsFromCashMachines();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPaymentsFromCashMachines(){
        int expected = 4;
        double actual = bank.paymentsFromCashMachines();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void shouldReturnAverageOfPayoutsFromCashMachines(){
        double expected = -180.0;
        double actual = bank.averageOfPayoutsFromCashMachines();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAverageOfPaymentsFromCashMachines(){
        double expected = 85.0;
        double actual = bank.averageOfPaymentsFromCashMachines();
        assertEquals(expected, actual);
    }


}