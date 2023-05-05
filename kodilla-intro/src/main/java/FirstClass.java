import com.kodilla.Application;
import com.kodilla.Notebook;
import com.kodilla.User;

import java.util.Random;
import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello from FirstClass!");


        Notebook notebook = new Notebook(600, 3000, 2022, 16, "Asus");
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.ram + " " + notebook.model);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceandYear();
        notebook.checkRam();

        Notebook heavyNotebook = new Notebook(2000, 1200, 2019, 8, "Accer");
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.ram + " " + heavyNotebook.model);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceandYear();
        heavyNotebook.checkRam();

        Notebook oldNotebook = new Notebook(1200, 500, 2017, 8, "HP");
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.ram + " " + oldNotebook.model);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceandYear();
        oldNotebook.checkRam();

        Notebook newNotebook = new Notebook(1100, 2000, 2023, 64, "Lenovo");
        System.out.println(newNotebook.weight + " " + newNotebook.price + " " + newNotebook.year + " " + newNotebook.ram + " " + newNotebook.model);
        newNotebook.checkWeight();
        newNotebook.checkPrice();
        newNotebook.checkPriceandYear();
        newNotebook.checkRam();



        User[] users = new User[6];

        users[0] = new User("Konrad", 24);
        users[1] = new User("Wiktoria", 22);
        users[2] = new User("Beata", 35);
        users[3] = new User("Przemysław", 48);
        System.out.println(users[0]);








        Random value = new Random();
    }



}