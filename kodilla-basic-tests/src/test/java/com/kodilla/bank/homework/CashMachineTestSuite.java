package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine = new CashMachine();
    @Test //test sprawdzającu rozmiar tablicy
    public void shouldHaveZeroLength() {
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0,transactions.length);
    }

    @Test //test sprawdzający czy dodanie elementu do tablicy zakończy się powodzeniem
    public void shouldAddTwoElementsToArray(){
        cashMachine.addTransactions(100.0);
        cashMachine.addTransactions(-20.0);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100.0, transactions[0]);
        assertEquals(-20.0, transactions[1]);
    }


    @Test //test sprwadzający czy metoda zwróci poprawne saldo banku
    public void moneyDepositAndWithdrawalTest(){
        double[] transactions = cashMachine.getTransactions();
        cashMachine.addTransactions(100.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(-20.0);
        double balance = cashMachine.getBalance();
        System.out.println("ATM balance: " + balance);

    }
}
