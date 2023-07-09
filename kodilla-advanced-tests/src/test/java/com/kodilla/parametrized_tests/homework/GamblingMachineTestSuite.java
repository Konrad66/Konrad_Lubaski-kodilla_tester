package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineCase.csv", numLinesToSkip = 0)
    public void testHowManyWins(String numbers) throws InvalidNumbersException {
        String[] numbersAssString = numbers.split(";");
        Set<String> setStringNumbers = new HashSet<>();
        for (String number : numbersAssString) {
            setStringNumbers.add(number);
        }
        Set<Integer> userNumber = setStringNumbers
                .stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());
        int result = gamblingMachine.howManyWins(userNumber);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvSource(value = {"5;10;15;20;25"})
    public void checkIfTheMethodThrowsAnException(String numbers) throws InvalidNumbersException {
        String[] numbersAssString = numbers.split(";");
        Set<String> setStringNumbers = new HashSet<>();
        for (String number : numbersAssString) {
            setStringNumbers.add(number);
        }

        Set<Integer> userNumber = setStringNumbers
                .stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumber));
    }


}