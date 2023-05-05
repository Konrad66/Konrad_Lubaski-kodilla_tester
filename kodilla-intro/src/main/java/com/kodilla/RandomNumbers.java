package com.kodilla;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random value = new Random();

        int biggest = 0;
        int smallest = 0;

        int sum = 0;
        while (sum <= 5000) {
            int liczba = value.nextInt(31);
            sum = sum + liczba;
        }
        System.out.println(sum);





    }
}