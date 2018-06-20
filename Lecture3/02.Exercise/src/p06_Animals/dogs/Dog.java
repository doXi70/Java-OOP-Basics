package p06_Animals.dogs;

import p06_Animals.Animal;

public class Dog extends Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("BauBau");
    }

}
