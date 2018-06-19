package p05_PizzaCalories.ingredients;

import p05_PizzaCalories.app_constants.Constants;
import p05_PizzaCalories.exceptions.dough.InvalidDoughWeightException;
import p05_PizzaCalories.exceptions.dough.InvalidTypeOfDoughException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dough extends BasicIngredient {
    // contains all possible valid floor types
    private final List<String> validFlourTypes =
            new ArrayList<>(Arrays.asList("white", "wholegrain"));

    // contains all possible valid baking techniques
    private final List<String> validBakingTechniques =
            new ArrayList<>(Arrays.asList("crispy", "chewy", "homemade"));

    // contains the flour type from the current instance
    private String flourType;

    // contains the baking technique from the current instance
    private String bakingTechnique;

    public Dough(String flourType, String bakingTechnique, double weightInGrams) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeigthInGrams(weightInGrams);
    }

    private void setFlourType(String flourType) {
        boolean isValidFlourType = false;

        for (String validFlourType : validFlourTypes) {
            if (flourType.toLowerCase().equals(validFlourType)) {
                isValidFlourType = true;
                break;
            }
        }

        if (!isValidFlourType) {
            throw new InvalidTypeOfDoughException(Constants.INVALID_TYPE_OF_DOUGH_MESSAGE);
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean isValidBakingTechnique = false;

        for (String validBakingTechnique : validBakingTechniques) {
            if (bakingTechnique.toLowerCase().equals(validBakingTechnique)) {
                isValidBakingTechnique = true;
                break;
            }
        }

        if (!isValidBakingTechnique) {
            throw new InvalidTypeOfDoughException(Constants.INVALID_TYPE_OF_DOUGH_MESSAGE);
        }

        this.bakingTechnique = bakingTechnique;
    }

    private double getBakingTechCals() {
        // TODO: REMOVE MAGICAL WORDS AND NUMBERS
        switch (this.bakingTechnique.toLowerCase()) {
            case "crispy":
                return 0.9;
            case "chewy":
                return 1.1;
            default:
                return 1.0;
        }

    }

    private double getFloorTypeCalories() {
        // TODO: REMOVE MAGICAL WORDS AND NUMBERS
        if (this.flourType.toLowerCase().equals("white")) {
            return 1.5;
        } else {
            return 1;
        }
    }

    @Override
    protected double getWeigthInGrams() {
        return super.weightInGrams;
    }

    @Override
    protected void setWeigthInGrams(double weightInGrams) {
        if (weightInGrams < Constants.MIN_INGREDIENT_WEIGHT || weightInGrams > Constants.MAX_DOUGH_WEIGHT) {
            throw new InvalidDoughWeightException(Constants.INVALID_DOUGH_WEIGHT_MESSAGE);
        }

        super.weightInGrams = weightInGrams;
    }

    public double getDoughCalories() {
        // TODO: REMOVE MAGICAL WORDS AND NUMBERS
        double floorCalories = getFloorTypeCalories();
        double bakingTechCals = getBakingTechCals();

        return (2 * this.getWeigthInGrams()) * floorCalories * bakingTechCals;
    }


}
