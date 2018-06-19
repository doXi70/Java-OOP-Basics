package p05_PizzaCalories.exceptions.topping;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidToppingWeightException extends InvalidApplicationInputException {
    public InvalidToppingWeightException(String message) {
        super(message);
    }
}
