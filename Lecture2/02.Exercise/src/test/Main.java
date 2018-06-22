package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String input = bufferedReader.readLine();
            int toppingNumber = Integer.parseInt(input.split(" ")[2]);
            Pizza pizza = new Pizza(input.split(" ")[1], toppingNumber);

            Dough.mapOfDoughProperties();
            Dough.mapOfDoughTypes();
            Topping.mapOfToppingTypes();

            while (true) {

                input = bufferedReader.readLine();

                if (input.equals("END")) {
                    break;
                }

                switch (input.split(" ")[0]) {
                    case "Dough":
                        Dough dough = new Dough(input.split(" ")[1], input.split(" ")[2]
                                , Double.parseDouble(input.split(" ")[3]));
                        pizza.setDough(dough);
                        break;
                    case "Topping":
                        Topping topping = new Topping(input.split(" ")[1],
                                Double.parseDouble(input.split(" ")[2]));
                        pizza.setToppings(topping);
                        break;
                }


            }

            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.calculateCalories());


        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}