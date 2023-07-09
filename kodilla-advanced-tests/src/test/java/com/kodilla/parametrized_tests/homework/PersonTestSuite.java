package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMISource#testGetBMI")
    public void testGetBMI(double height, double weight, String expected){
        Person person = new Person(height, weight);
        String result = person.getBMI();
        assertEquals(expected, result);
    }


    //przykładowy test
    @Test
    public void example(){
        Person person = new Person(1.76,85);
        String result = person.getBMI();
        assertEquals("Overweight", result);
    }
}