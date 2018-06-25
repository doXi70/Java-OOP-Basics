package p03_WildFarm.animals.animalImpl;

import p03_WildFarm.animals.animal.BaseMammal;
import p03_WildFarm.exceptions.AnimalDoesNotEatProvidedFoodException;
import p03_WildFarm.foods.Food;

import static p03_WildFarm.constants.Constant.FEED_EXCEPTION_MESSAGE;

public class Zebra extends BaseMammal {
    public Zebra(String name, String type, Double weight, Integer foodEaten, String livingRegion) {
        super(name, type, weight, foodEaten, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
        this.makeSound();

        if (!food.getClass().getSimpleName().equals("Vegetable")) {
            throw new AnimalDoesNotEatProvidedFoodException(
                    String.format("%ss %s", this.getClass().getSimpleName(), FEED_EXCEPTION_MESSAGE));
        }

        super.setFoodEaten(food.getQuantity());
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }
}
