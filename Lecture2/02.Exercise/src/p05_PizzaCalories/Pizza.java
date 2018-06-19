package p05_PizzaCalories;

import p05_PizzaCalories.exceptions.pizza.InvalidPizzaNameException;
import p05_PizzaCalories.exceptions.topping.InvalidToppingCountException;
import p05_PizzaCalories.ingredients.Dough;
import p05_PizzaCalories.ingredients.Topping;

import java.util.ArrayList;
import java.util.List;

import static p05_PizzaCalories.app_constants.Constants.*;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppingsSize) {
        setName(name);
        isValidToppingsSize(toppingsSize);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().length() < MIN_PIZZA_NAME_LENGTH || name.trim().length() > MAX_PIZZA_NAME_LENGTH) {
            throw new InvalidPizzaNameException(INVALID_PIZZA_NAME_MESSAGE);
        }
        this.name = name;
    }

    private void isValidToppingsSize(int toppingsSize) {
        if (toppingsSize < MIN_TOPPING_COUNT || toppingsSize > MAX_TOPPING_COUNT) {
            throw new InvalidToppingCountException(INVALID_TOPPING_COUNT_MESSAGE);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private double calculatePizzaCalories() {
        double doughCalories = this.dough.getDoughCalories();
        double totalToppingsCalories = this.toppings.stream().mapToDouble(Topping::getToppingCalories).sum();

        return doughCalories + totalToppingsCalories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, this.calculatePizzaCalories());
    }
}
