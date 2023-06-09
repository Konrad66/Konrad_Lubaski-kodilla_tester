package com.kodilla.abstracts.homewrok2;

public class Application {

    public static void main(String[] args) {


        Builder builder = new Builder();
        Lawyer lawyer = new Lawyer();
        Person person = new Person("Konrad", 24, "Builder");
        person.displayFirsName();
        builder.displayResponsibilities();
        builder.displaySalary();
        Person person1 = new Person("Wiktoria", 21, "Lawyer");
        person1.displayFirsName();
        lawyer.displayResponsibilities();
        lawyer.displaySalary();
    }
}
