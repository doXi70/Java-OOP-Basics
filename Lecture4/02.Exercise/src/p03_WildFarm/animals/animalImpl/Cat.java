package p03_WildFarm.animals.animalImpl;

import p03_WildFarm.animals.animal.BaseMammal;
import p03_WildFarm.foods.Food;

import java.text.DecimalFormat;

public class Cat extends BaseMammal {
    private final static DecimalFormat FORMAT = new DecimalFormat("#.##");
    private String breed;

    public Cat(String name, String type, Double weight,
               Integer foodEaten, String livingRegion, String breed) {

        super(name, type, weight, foodEaten, livingRegion);
        setBreed(breed);
    }

    private String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eatFood(Food food) {
        this.makeSound();
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getClass().getSimpleName(), super.getName(), this.getBreed(),
                FORMAT.format(super.getWeight()), super.getLivingRegion(), super.getFoodEaten());
    }
}
