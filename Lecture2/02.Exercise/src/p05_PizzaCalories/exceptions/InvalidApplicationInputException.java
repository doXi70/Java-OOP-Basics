package p05_PizzaCalories.exceptions;

public class InvalidApplicationInputException extends RuntimeException {
    public InvalidApplicationInputException(String message) {
        super(message);
    }
}
