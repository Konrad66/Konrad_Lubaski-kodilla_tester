package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTestSuite {

    @Test
    public void shouldReturnSUVAndLightOn(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car suv = (SUV) context.getBean("com.kodilla.spring");
        //when
        String carType = suv.getCarType();
        //then
        Assertions.assertEquals(0, carType);
    }


    @Test
    public void shouldReturnCabrioAndLightOkn() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        CarConfiguration carConfig = context.getBean(CarConfiguration.class);

        // When
        Car cabrio = carConfig.getCarBasedONSeasons();
        //Car suv1 = carConfig.setHeadLightsBasedOnTime();
        String carType = cabrio.getCarType();

        // Then
        Assertions.assertEquals("Cabrio", carType);
        //Assertions.assertEquals("", suv1);
    }




}