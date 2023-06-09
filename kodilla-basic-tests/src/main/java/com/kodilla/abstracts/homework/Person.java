package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Person {
    private String firsName;
    private int age;
    private Job job;

    public Person(String firsName, int age, String job){
        this.firsName = firsName;
        this.age = age;
    }

    public void displayFirsName(){
        System.out.println("My name is: " + firsName + ". I'm: " + job + ". I am " + age + " years old");
    }


}
