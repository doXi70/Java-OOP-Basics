package p03_WildFarm;

import p03_WildFarm.animals.animal.BaseMammal;
import p03_WildFarm.animals.animalImpl.Cat;
import p03_WildFarm.animals.animalImpl.Mouse;
import p03_WildFarm.animals.animalImpl.Tiger;
import p03_WildFarm.animals.animalImpl.Zebra;
import p03_WildFarm.exceptions.AnimalDoesNotEatProvidedFoodException;
import p03_WildFarm.foods.Food;
import p03_WildFarm.foods.Meat;
import p03_WildFarm.foods.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static p03_WildFarm.constants.Constant.*;

public class Main {
    private static int inputLinesCounter = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<BaseMammal> mammals = new ArrayList<>();

        String line;
        while (!APPLICATION_TERMINATION_COMMAND.equals(line = reader.readLine())) {
            inputLinesCounter++;
            String[] tokens = line.split("\\s+");

            if (inputLinesCounter % 2 != 0) {
                String animalType = tokens[0];
                String animalName = tokens[1];
                Double animalWeight = Double.parseDouble(tokens[2]);
                String animalLivingRegion = tokens[3];
                String catBreed = animalType.equals(ANIMAL_TYPE_CAT) ? tokens[4] : null;

                processInfo(animalType, animalName, animalWeight, animalLivingRegion, catBreed, mammals);
            } else {
                String foodType = tokens[0];
                int foodAmount = Integer.parseInt(tokens[1]);

                Food food = null;
                if (foodType.equals(FOOD_TYPE_MEAT)) {
                    food = new Meat(foodAmount);
                } else if (foodType.equals(FOOD_TYPE_VEGETABLE)) {
                    food = new Vegetable(foodAmount);
                }

                processInfo(food, mammals);
            }
        }

        mammals.forEach(System.out::println);
    }

    private static void processInfo(Food food, List<BaseMammal> mammals) {
        BaseMammal mammal = mammals.get(mammals.size() - 1);

        try {
            mammal.eatFood(food);
        } catch (AnimalDoesNotEatProvidedFoodException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void processInfo(String animalType, String animalName, Double animalWeight,
                                    String animalLivingRegion, String catBreed, List<BaseMammal> mammals) {

        switch (animalType) {
            case ANIMAL_TYPE_CAT:
                mammals.add(new Cat(animalName, animalType, animalWeight, 0, animalLivingRegion, catBreed));
                break;
            case ANIMAL_TYPE_MOUSE:
                mammals.add(new Mouse(animalName, animalType, animalWeight, 0, animalLivingRegion));
                break;
            case ANIMAL_TYPE_TIGER:
                mammals.add(new Tiger(animalName, animalType, animalWeight, 0, animalLivingRegion));
                break;
            case ANIMAL_TYPE_ZEBRA:
                mammals.add(new Zebra(animalName, animalType, animalWeight, 0, animalLivingRegion));
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }


}
