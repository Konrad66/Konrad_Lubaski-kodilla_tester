package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private int numberOfClass;
    private List<Integer> numbersOfStudents = new ArrayList<>();


    public School(String schoolName, int numberOfClass, List<Integer> numbersOfStudents) {
        this.schoolName = schoolName;
        this.numberOfClass = numberOfClass;
        this.numbersOfStudents = numbersOfStudents;
    }

    public int getSumOfStudents(){
        int sum = 0;
        for (int number : numbersOfStudents){
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return schoolName + " There are: " + numberOfClass + " classses in the school." + " In each class there are " + numbersOfStudents + " students in turn." + "Total number of students is: " + getSumOfStudents();
    }
}
