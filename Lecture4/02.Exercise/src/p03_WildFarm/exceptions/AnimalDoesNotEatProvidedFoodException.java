package p03_WildFarm.exceptions;

public class AnimalDoesNotEatProvidedFoodException extends RuntimeException {
    public AnimalDoesNotEatProvidedFoodException(String message) {
        super(message);
    }
}
