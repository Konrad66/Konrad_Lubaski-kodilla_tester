package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Person {
    private String firsName;
    private int age;
    private Job job;

    public Person(String firsName, int age, Job job){
        this.firsName = firsName;
        this.age = age;
        this.job = job;
    }

    public int getAge(){
        return age;
    }

    public String getFirsName(){
        return firsName;
    }

    public Job getJob(){
        return job;
    }

    public void displayResponsibilities(){
        System.out.println("Responsibilities of: " + firsName + " at work: " + job.getResponsibilities());
        System.out.println("He is: " + age + " years old and he earns " + job.getSalary());
    }
}
