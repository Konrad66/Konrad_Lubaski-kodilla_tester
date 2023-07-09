package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISource {
    private static Stream<Arguments> testGetBMI() {
        return Stream.of(
                Arguments.of(1.76, 85, "Overweight"),
                Arguments.of(1.63, 57, "Normal (healthy weight)"),
                Arguments.of(1.78, 80, "Overweight"),
                Arguments.of(1.57, 42, "Underweight")
        );
    }
}
