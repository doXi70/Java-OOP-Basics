package p05_PizzaCalories.exceptions.dough;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidDoughWeightException extends InvalidApplicationInputException {

    public InvalidDoughWeightException(String message) {
        super(message);
    }
}
