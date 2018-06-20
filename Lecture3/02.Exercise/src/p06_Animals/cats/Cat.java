package p06_Animals.cats;

import p06_Animals.Animal;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("MiauMiau");
    }
}
