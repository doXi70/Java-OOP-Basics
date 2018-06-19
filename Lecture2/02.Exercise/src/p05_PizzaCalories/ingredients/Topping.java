package p05_PizzaCalories.ingredients;

import p05_PizzaCalories.app_constants.Constants;
import p05_PizzaCalories.exceptions.topping.InvalidToppingWeightException;
import p05_PizzaCalories.exceptions.topping.InvalidTypeOfToppingException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topping extends BasicIngredient {
    // all valid topping types
    private final List<String> validToppingTypes =
            new ArrayList<>(Arrays.asList("meat", "veggies", "cheese", "sauce"));

    // current instance topping type
    private String toppingType;

    public Topping(String toppingType, double weightInGrams) {
        setToppingType(toppingType);
        setWeigthInGrams(weightInGrams);
    }

    private void setToppingType(String toppingType) {
        boolean isValidToppingType = false;

        for (String validToppingType : validToppingTypes) {
            if (toppingType.toLowerCase().equals(validToppingType)) {
                isValidToppingType = true;
                break;
            }
        }

        if (!isValidToppingType) {
            throw new InvalidTypeOfToppingException(
                    String.format("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = toppingType;
    }

    @Override
    protected double getWeigthInGrams() {
        return super.weightInGrams;
    }

    @Override
    protected void setWeigthInGrams(double weigthInGrams) {

        if (weigthInGrams < Constants.MIN_INGREDIENT_WEIGHT ||
                weigthInGrams > Constants.MAX_TOPPING_WEIGHT) {

            throw new InvalidToppingWeightException(
                    String.format("%s weight should be in the range [1..50].", this.toppingType));
        }

        super.weightInGrams = weigthInGrams;
    }

    public double getToppingCalories() {
        double toppingModifier;

        switch (this.toppingType.toLowerCase()) {
            case "meat":
                toppingModifier = 1.2;
                break;
            case "veggies":
                toppingModifier = 0.8;
                break;
            case "cheese":
                toppingModifier = 1.1;
                break;
            default:
                toppingModifier = 0.9;
                break;
        }

        return (2 * this.getWeigthInGrams()) * toppingModifier;
    }
}
