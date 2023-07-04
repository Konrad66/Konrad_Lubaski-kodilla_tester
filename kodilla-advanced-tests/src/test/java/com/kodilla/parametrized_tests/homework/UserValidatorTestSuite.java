package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Kolo-luba,true", "WikToRi4.66,true"})
    public void shouldReturnTrueOrFalseIfUsernameIsCorrectOrNot(String input, Boolean expected){
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"kolo@gmail.com,true", "hej3435,false"})
    public void shouldReturnTrueOrFalseIfEmailIsCorrectOrNot(String input, Boolean expected){
        assertEquals(expected, userValidator.validateEmail(input));
    }


    @ParameterizedTest
    @CsvSource(value = {"email@gmail.com:true", "mail,@x.com:false", "wrongmail,123@:false"}, delimiter = ':')
    public void shouldReturnTrueOrFalseIfEmailIsCorrectOrNot_withDelimiter(String input, Boolean expected){
        assertEquals(expected, userValidator.validateEmail(input));
    }

}