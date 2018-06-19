package p05_PizzaCalories;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;
import p05_PizzaCalories.ingredients.Dough;
import p05_PizzaCalories.ingredients.Topping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaTokens = reader.readLine().trim().split(" ");
        String pizzaName = pizzaTokens[1];
        int toppingsCount = Integer.parseInt(pizzaTokens[2]);

        try {
            Pizza pizza = new Pizza(pizzaName, toppingsCount);

            String[] doughTokens = reader.readLine().split(" ");
            String doughFloorType = doughTokens[1];
            String doughBakingTechnique = doughTokens[2];
            double doughWeightInGrams = Double.parseDouble(doughTokens[3]);

            Dough dough = new Dough(doughFloorType, doughBakingTechnique, doughWeightInGrams);
            pizza.setDough(dough);

            for (int i = 0; i < toppingsCount; i++) {
                String[] toppingTokens = reader.readLine().split(" ");
                String toppingType = toppingTokens[1];
                double toppingWeight = Double.parseDouble(toppingTokens[2]);

                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);
            }

            System.out.println(pizza);
        } catch (InvalidApplicationInputException iaie) {
            System.out.println(iaie.getMessage());
        }

    }
}
