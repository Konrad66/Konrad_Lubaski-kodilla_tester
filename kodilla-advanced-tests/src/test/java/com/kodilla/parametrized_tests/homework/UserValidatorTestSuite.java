package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Kolo-luba,true", "WikToRi4.66,true"})
    public void sh(String input, Boolean expected){
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"kolo@gmail.com,true", "hej3435,false"})
    public void shhemail(String input, Boolean expected){
        assertEquals(expected, userValidator.validateEmail(input));
    }

}