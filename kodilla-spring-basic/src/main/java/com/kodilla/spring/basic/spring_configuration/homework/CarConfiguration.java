package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Random;

@Configuration
public class CarConfiguration {

    /*

    @Bean
    public Car getCarBasedONSeasons() {
        Car car;
        if (getCarBasedONSeasons >= 3 && getCarBasedONSeasons <= 5) {
            return car = new Sedan(true);
        } else if (getCarBasedONSeasons >= 6 && getCarBasedONSeasons <= 8) {
            return car = new Cabrio(true);
        } else if (getCarBasedONSeasons >= 9 && getCarBasedONSeasons <= 11) {
            return car = new Sedan(true);
        } else {
            return car = new SUV(true);
        }
    }

    @Bean
    public SUV createCar() {
        return new SUV(true);
    }

    @Bean
    public int setHeadLightsBasedOnTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        if (hour >= 20 || hour >= 6) {
            return setHeadLightsBasedOnTime;
        }
        return setHeadLightsBasedOnTime;
    }

     */
}