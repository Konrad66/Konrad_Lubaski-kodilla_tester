package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTestSuite {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        com.kodilla.jacoco.Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
}
