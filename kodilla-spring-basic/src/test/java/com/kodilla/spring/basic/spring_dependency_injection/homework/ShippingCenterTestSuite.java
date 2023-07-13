package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {


    @Test
    public void shouldDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("3 Maja, Katowice", 15.4);
        Assertions.assertNotNull(result);
    }

    @Test
    public void testForDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("3 Maja, Katowice", 14);
        Assertions.assertEquals("Package delivered to: 3 Maja, Katowice", result);
    }

    @Test
    public void testForPackageHeavierThan30KG() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Oswobodzenia", 31);
        Assertions.assertFalse(false);
        Assertions.assertEquals("Package not delivered to: Oswobodzenia",result);
    }
}