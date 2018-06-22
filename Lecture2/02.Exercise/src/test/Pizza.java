package test;

import java.util.LinkedList;
import java.util.List;

//  Toppings from 0 to 10
// Name trim
public class Pizza {
    private String name;
    private Dough dough;
    private int numberOfTopping;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfTopping) {
        if(name.trim().length() < 1 || name.trim().length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        if(numberOfTopping < 0 || numberOfTopping > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.name = name;
        this.dough = new Dough();
        this.toppings = new LinkedList<>();
        this.numberOfTopping = numberOfTopping;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }



    public void setToppings(Topping topping) {
        this.toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public double calculateCalories() {
        Double doughCalories = this.dough.doughCalories();
        Double toppingCalories = 0.0;


        for (Topping topping : toppings) {
            toppingCalories = toppingCalories + topping.caloriesTopping();
        }

        return doughCalories + toppingCalories;
    }


}