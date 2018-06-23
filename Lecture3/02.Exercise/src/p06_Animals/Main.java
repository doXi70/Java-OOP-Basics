package p06_Animals;

import p06_Animals.cats.Cat;
import p06_Animals.cats.Kitten;
import p06_Animals.dogs.Dog;
import p06_Animals.cats.Tomcat;
import p06_Animals.frogs.Frog;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String animalType;
        while (!"Beast!".equals(animalType = reader.readLine())) {
            String[] animalTokens = reader.readLine().trim().split(" ");

            try {
                Animal animal = newAnimal(animalType, animalTokens);
                System.out.println(animal);
                animal.produceSound();
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private static Animal newAnimal(String animalType, String[] animalTokens) {
        switch (animalType) {
            case "Cat":
                return new Cat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Kitten":
                return new Kitten(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Dog":
                return new Dog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Tomcat":
                return new Tomcat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Frog":
                return new Frog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }
}
