package p05_PizzaCalories.exceptions.dough;

import p05_PizzaCalories.exceptions.InvalidApplicationInputException;

public class InvalidTypeOfDoughException extends InvalidApplicationInputException {

    public InvalidTypeOfDoughException(String message) {
        super(message);
    }
}
