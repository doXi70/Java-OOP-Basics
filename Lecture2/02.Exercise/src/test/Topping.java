package test;

import java.util.HashMap;
import java.util.Map;

// Dot in toppings weight
public class Topping {
    private String toppingName;
    private Double weightTopping;

    private static Map<String, Double> toppingTypes = new HashMap<>();

    public static void mapOfToppingTypes() {
        toppingTypes.put("Meat", 1.2);
        toppingTypes.put("Veggies", 0.8);
        toppingTypes.put("Cheese", 1.1);
        toppingTypes.put("Sauce", 0.9);

    }

    public Topping() {
        this.toppingName = "";
    }

    public Topping(String toppingName, double weightTopping) {
        if (!toppingTypes.containsKey(toppingName)) {
            throw new IllegalArgumentException("Cannot place " + toppingName + " on top of your pizza.");
        }

        if (weightTopping < 1 || weightTopping > 50) {
            throw new IllegalArgumentException(toppingName + " weight should be in the range [1..50].");
        }

        this.weightTopping = weightTopping;
        this.toppingName = toppingName;
    }

    public void setToppingName(String toppingName) {
        if (!toppingTypes.containsKey(toppingName)) {
            throw new IllegalArgumentException("Cannot place " + toppingName + " on top of your pizza.");
        }

        this.toppingName = toppingName;
    }

    public void setWeightTopping(double weightTopping) {
        if (weightTopping < 1 || weightTopping > 50) {
            throw new IllegalArgumentException(toppingName + " weight should be in the range [1..50].");
        }

        this.weightTopping = weightTopping;
    }

    private double getToppingModifier() {
        return toppingTypes.get(this.toppingName);
    }

    public double caloriesTopping(){
        return (2*this.weightTopping)*this.getToppingModifier();
    }

}