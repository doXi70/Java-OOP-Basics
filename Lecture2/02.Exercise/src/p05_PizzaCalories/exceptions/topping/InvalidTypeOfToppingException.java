package p05_PizzaCalories.exceptions.topping;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidTypeOfToppingException extends InvalidApplicationInputException {
    public InvalidTypeOfToppingException(String message) {
        super(message);
    }
}
