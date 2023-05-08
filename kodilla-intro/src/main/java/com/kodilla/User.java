package com.kodilla;

public class User {
    String name;
    int age;


    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User Konrad = new User("Konrad", 24);
        User Wiktoria = new User("Wiktoria", 22);
        User Artur = new User("Artur", 26);
        User Monika = new User("Monika", 23);


        User[] users = {Konrad, Wiktoria, Artur, Monika};
        //int[] users1 = {24, 22, 26, 23};

        int numberOfElements = users.length;

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        int avarage = result / users.length;
        System.out.println("Avarage of age is: " + avarage);


        for (int i = 0; i < users.length; i++) {
            if (users[i].age <= avarage) {
                System.out.println("Wiek jest mniejszy niz srednia " + users[i].name);

            }
        }
    }
}