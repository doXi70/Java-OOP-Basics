package p06_Animals.frogs;

import p06_Animals.Animal;

public class Frog extends Animal {
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Frogggg");
    }

}
