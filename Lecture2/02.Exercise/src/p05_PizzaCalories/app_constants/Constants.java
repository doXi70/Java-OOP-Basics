package p05_PizzaCalories.app_constants;

public final class Constants {
    public final static String INVALID_TYPE_OF_DOUGH_MESSAGE = "Invalid type of dough.";

    public final static double MIN_INGREDIENT_WEIGHT = 1;
    public final static double MAX_DOUGH_WEIGHT = 200;
    public final static String INVALID_DOUGH_WEIGHT_MESSAGE = "Dough weight should be in the range [1..200].";


    public final static String INVALID_PIZZA_NAME_MESSAGE = "Pizza name should be between 1 and 15 symbols.";
    public final static int MIN_PIZZA_NAME_LENGTH = 1;
    public final static int MAX_PIZZA_NAME_LENGTH = 10;


    public final static int MIN_TOPPING_COUNT = 0;
    public final static int MAX_TOPPING_COUNT = 10;
    public final static double MAX_TOPPING_WEIGHT = 50;
    public final static String INVALID_TOPPING_COUNT_MESSAGE = "Number of toppings should be in range [0..10].";


    private Constants() {

    }


}
