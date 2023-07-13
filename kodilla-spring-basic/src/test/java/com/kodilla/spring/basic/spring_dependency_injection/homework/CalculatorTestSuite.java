package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    private Calculator bean = context.getBean(Calculator.class);

    @Test
    public void testForAdd() {
        double result = bean.add(4, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testForSubtract() {
        double result = bean.subtract(5, 4);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testForMultiply(){
        double result = bean.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testForDivide(){
        double result = bean.divide(4, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testForDivideByZero(){
        double result = bean.divide(4, 0);
        Assertions.assertFalse(false);
    }

    @Test
    public void testDisplayValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        Assertions.assertNotNull(bean);
    }

}