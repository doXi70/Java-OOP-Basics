package p05_PizzaCalories.ingredients;

public abstract class BasicIngredient {
    protected double weightInGrams;

    protected abstract double getWeigthInGrams();

    protected abstract void setWeigthInGrams(double weightInGrams);
}
