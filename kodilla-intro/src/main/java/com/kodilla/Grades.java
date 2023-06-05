package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value){
        if (this.size == grades.length) {
            return;  //przerwanie działania
        }
        this.grades[this.size = 0] = value;
        this.size++;
    }

    public int returnLastGrades() {
        if (this.size > 0) {
            return this.grades[this.size - 1]; //nie można sie odwołac do - elemntu tablicy
        } else {
            return 0;
        }
    }

    public double avarageOfGrades(){
        double sum = 0;
        for(int i = 0; i < this.size; i++){
            sum = sum + this.grades[i];
        }
        return sum /this.size;
    }
}