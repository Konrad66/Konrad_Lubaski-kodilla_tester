package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTestSuite {

    /*
    @Test
    public void shouldReturnSUVAndLightOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        CarConfiguration carConfig = context.getBean(CarConfiguration.class);
        //when
        CarConfiguration carConfiguration = new CarConfiguration(6, 22);
        Car cabrio = carConfiguration.getCarBasedONSeasons();
        Car cabrioo = carConfig.getCarBasedONSeasons();
        //then
        //Assertions.assertEquals("Cabrio", cabrio);
        Assertions.assertEquals("Cabrio", cabrio);
    }


    @Test
    public void shouldReturnTrueForSUV() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createCar");

        //when


        //then

    }

    @Test
    public void shouldReturnSUV() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createCar", 1, 16);

        //when
        //String carName = suv.getCarType();
        Boolean lights = suv.hasHeadlightsTurnedOn();
        //then
        //Assertions.assertEquals("SUV", carName);
        Assertions.assertTrue(lights);
    }




    @Test
    public void shouldReturnCabrioAndLightOkn() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        CarConfiguration carConfig = context.getBean(CarConfiguration.class);

        // When
        Car cabrio = carConfig.getCarBasedONSeasons();
        //Car suv1 = carConfig.setHeadLightsBasedOnTime();
        //String carType = cabrio.getCarType();

        // Then
        Assertions.assertEquals("Cabrio", cabrio);
        //Assertions.assertEquals("", suv1);
    }


    @Test
    public void test(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCarBasedONSeasons");

        //when
        String getCarModel = car.getCarType();
        System.out.println(getCarModel);

        //then
        List<String> possibleModels = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleModels.contains(getCarModel));
    }

     */


}