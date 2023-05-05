package com.kodilla;

public class User {
    String name;
    int age;


    public User(String name, int age){
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args){

        User Konrad = new User("Konrad", 24);
        User Wiktoria = new User("Wiktoria", 22);
        User Artur = new User("Artur", 26);
        User Monika = new User("Monika", 23);


        User[] users = {Konrad, Wiktoria, Artur, Monika};
        int[] users1 = {24, 22, 26, 23};


        int numberOfElements = users1.length;

        int result = 0;
        for(int i = 0; i < users1.length; i++){
            result = result + users1[i];
        }
        int avarage = result / users1.length;
        System.out.println(avarage);




        for(int i = 0; i < avarage ; i++){
            System.out.println();


            //if( users1[i] < avarage){
              //  System.out.println("Wiek jest wiekszy niz srednia");
            //} else {
              //  System.out.println("Wiek jest mniejeszy");
            //}
        }
    }

}
