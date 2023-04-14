package com.kodilla;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        System.out.println(numberOfElements);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        String[] values = new String[]{"1", "2", "3", "4"};
        int numberOfElements2 = values.length;
        System.out.println(numberOfElements2);

        for (int i = 0; i <= 3; i++) {
            System.out.println(values[i]);
        }



        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }
    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println(result);
        return result;
    }

    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }




}
