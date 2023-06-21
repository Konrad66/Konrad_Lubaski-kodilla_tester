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
        assertEquals(30, balance);
    }

    @Test //test sorawdzajacy czy metoda zwróci liczbę wykonanych transakcji
    public void shouldReturnTransactionCount(){
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(100.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(-20.0);
        int transactionCount = cashMachine.getTransactionCount();
        assertEquals(3, transactionCount);
    }

    @Test //test sprawdzajacy czy metoda zwroci liczbe transakcji związanych z wypłatą
    public void shouldReturnPayoutFromCashMachine(){
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(100.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(-20.0);
        double payout = cashMachine.getNumberOfPayoutsTransactions();
        assertEquals(2, payout);
    }

    @Test //test sprawdzajacy czy metoda zwroci liczbe transakcji związanych z wpłatą
    public void shouldReturnPaymentsFromCashMachine() {
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(10.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(20.0);
        cashMachine.addTransactions(500.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(10.0);
        double payment = cashMachine.getNumberOfPaymentTransactions();
        assertEquals(4, payment);
    }

    @Test //test sprawdzajacy czy metoda zwroci odpowiednia średnią z wpłaconych transakcji
    public void shouldReturnAverageOFPaymentsFromCashMachine(){
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(10.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(20.0);
        cashMachine.addTransactions(500.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(10.0);
        double averageOfPayments = cashMachine.getAverageOfPayments();
        assertEquals(135, averageOfPayments);
    }

    @Test //test sprawdzajacy czy metoda zwroci odpowiednia srednia wypłaconych transakcji
    public void shouldReturnAverageOFPayoutsFromCashMachine(){
        double[] transaction = cashMachine.getTransactions();
        cashMachine.addTransactions(10.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(20.0);
        cashMachine.addTransactions(500.0);
        cashMachine.addTransactions(-50.0);
        cashMachine.addTransactions(10.0);
        double averageOfPayouts = cashMachine.getAverageOfPayouts();
        assertEquals(-50, averageOfPayouts);
    }
}
