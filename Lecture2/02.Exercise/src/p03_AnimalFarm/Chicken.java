package p03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private final static DecimalFormat df = new DecimalFormat("#.##");

    private String name;
    private int age;
    private double eggsProducedPerDay;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setEggsProducedPerDay();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.age = age;
    }

    private void setEggsProducedPerDay() {
        if (age <= 5) {
            this.eggsProducedPerDay = 2;
        } else if (age <= 11) {
            this.eggsProducedPerDay = 1;
        } else {
            this.eggsProducedPerDay = 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",
                this.name, this.age, df.format(this.eggsProducedPerDay));
    }
}
