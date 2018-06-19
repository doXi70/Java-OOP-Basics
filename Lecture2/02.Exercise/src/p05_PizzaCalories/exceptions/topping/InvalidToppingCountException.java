package p05_PizzaCalories.exceptions.topping;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidToppingCountException extends InvalidApplicationInputException {
    public InvalidToppingCountException(String message) {
        super(message);
    }
}
