package p03_WildFarm.animals.animal;

import p03_WildFarm.foods.Food;

public abstract class BaseAnimal {
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;

    public BaseAnimal(String name, String type, Double weight, Integer foodEaten) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = foodEaten;
    }

    public abstract void eatFood(Food food);

    protected abstract void makeSound();

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    protected String getName() {
        return this.name;
    }

    protected String getType() {
        return this.type;
    }

    protected Double getWeight() {
        return this.weight;
    }

}
