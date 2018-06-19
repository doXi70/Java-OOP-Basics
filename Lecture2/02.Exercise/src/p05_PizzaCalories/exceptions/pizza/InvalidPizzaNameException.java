package p05_PizzaCalories.exceptions.pizza;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidPizzaNameException extends InvalidApplicationInputException {

    public InvalidPizzaNameException(String message) {
        super(message);
    }
}
