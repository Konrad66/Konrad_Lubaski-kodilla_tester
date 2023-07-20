package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTestSuite {
    private CarConfiguration carConfiguration = new CarConfiguration();

    @Test
    public void shouldReturnCarNameForSUV() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");

        //when
        String carName = suv.getCarType();

        //then
        Assertions.assertEquals("SUV", carName);
    }

    @Test
    public void shouldReturnCarNameForSedan() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Sedan sedan = (Sedan) context.getBean("createSedan");

        //when
        String carName = sedan.getCarType();

        //then
        Assertions.assertEquals("Sedan", carName);
    }

    @Test
    public void shouldReturnCarNameForCabrio() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("createCabrio");

        //when
        String carName = cabrio.getCarType();

        //then
        Assertions.assertEquals("Cabrio", carName);
    }

    @Test
    public void shouldReturnCabrioAndLightsOn() {
        //given
        String season = "Summer";
        LocalTime hour = LocalTime.of(21, 2);
        String carType = "Cabrio";
        boolean lights = true;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar", season, hour);

        //when
        String carModel = car.getCarType();
        boolean carLights = car.hasHeadlightsTurnedOn();
        System.out.println(carModel);

        //then
        Assertions.assertEquals(carType, carModel);
        Assertions.assertEquals(lights, carLights);
    }
}