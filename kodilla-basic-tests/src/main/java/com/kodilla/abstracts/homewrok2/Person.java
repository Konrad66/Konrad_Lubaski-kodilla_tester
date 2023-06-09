package com.kodilla.abstracts.homewrok2;

public class Person {
    private String firsName;
    private int age;
    private String job;

    public Person(String firsName, int age, String job){
        this.firsName = firsName;
        this.age = age;
        this.job = job;
    }

    public void displayFirsName(){
        System.out.println("My name is: " + firsName + ". I'm: " + job + ". I am " + age + " years old");
    }


}
