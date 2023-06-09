package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary(){
        return salary;
    }
    public String getResponsibilities(){
        return responsibilities;
    }
    public void displayResponsibilities(){
        System.out.println("My duties at work are: " + getResponsibilities());
    }
    public void displaySalary(){
        System.out.println("My salary is: " + getSalary());
    }
}