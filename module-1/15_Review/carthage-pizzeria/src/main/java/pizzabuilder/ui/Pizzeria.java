package pizzabuilder.ui;

import pizzabuilder.materials.*;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        System.out.println("Welcome to the pizzeria");

        Pizza pizza = new Pizza();
        int toppingsCount = 0;
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        do {
            System.out.println("P for Pepperoni | C for Cheese | M for Mushrooms | Q to finish");
            String input = scanner.nextLine();

            Topping topping;

            if (input.equals("C")) {
                System.out.println("Adding Cheese");
                topping = new Cheese();
                pizza.addTopping(topping);

            } else if (input.equals("P")) {
                System.out.println("Adding Pepperoni");
                topping = new Pepperoni();
                pizza.addTopping(topping);

            } else if (input.equals("M")) {
                System.out.println("Adding Mushrooms");
                topping = new Mushroom();
                pizza.addTopping(topping);

            } else if (input.equals("Q")) {
                quit = true;
            } else {
                System.out.println("Invalid topping");
                continue;
            }

            toppingsCount++;

        } while(!quit && toppingsCount < 3);

        System.out.println(pizza);

    }
}
