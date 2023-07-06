package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    private static Stream<Arguments> testGetBMI() {
        return Stream.of(
                Arguments.of(1.76, 85, "Overweight"),
                Arguments.of(1.63, 57, "Normal (healthy weight)"),
                Arguments.of(1.78, 80, "Normal (healthy weight)")
                );
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.Person#getBMI")
    public void testGetBMI(double height, double weight, String expected){
        Person person = new Person(height, weight);
        String result = person.getBMI();
        assertEquals(expected, result);
    }


    @Test
    public void example(){
        Person person = new Person(1.76,85);
        String result = person.getBMI();
        assertEquals("Overweight", result);
    }
}