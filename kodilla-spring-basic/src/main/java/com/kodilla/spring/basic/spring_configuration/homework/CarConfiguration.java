package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Random;

@Configuration
public class CarConfiguration {

    @Bean
    public Car getCarBasedONSeasons() {
        Car car;
        LocalDateTime currentTime = LocalDateTime.now();
        int month = currentTime.getMonthValue();

        if (month >= 3 && month <= 5) {
            return car = new Sedan();
        } else if (month >= 6 && month <= 8) {
            return car = new Cabrio();
        } else if (month >= 9 && month <= 11) {
            return car = new Sedan();
        } else {
            return car = new SUV();
        }
    }

    /*
    @Bean
    public boolean setHeadLightsBasedOnTime(Car car, int hour) {
        if (hour >= 20 || hour >= 6) {
            System.out.println("lights are on");;
        }
        return  car.hasHeadlightsTurnedOn();
    }

     */


}