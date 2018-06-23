package p01_Vehicles;

import java.text.DecimalFormat;

@SuppressWarnings("Duplicates")
public class Car extends Vehicle {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Car(double fuelQuantity, double fuelConsumption) {
        double actualFuelConsumption = fuelConsumption + 0.9;

        super.setFuelQuantity(fuelQuantity);
        super.setFuelConsumption(actualFuelConsumption);
    }

    @Override
    public void drive(double distance) {
        double litersSpend = distance * super.getFuelConsumption();
        if (litersSpend > super.getFuelQuantity()) {
            System.out.println("Car needs refueling");
        } else {
            double currLitters = super.getFuelQuantity();
            currLitters -= litersSpend;
            super.setFuelQuantity(currLitters);

            System.out.println(String.format("Car travelled %s km", decimalFormat.format(distance)));
        }
    }

    @Override
    public void refuel(double liters) {
        double currLitters = super.getFuelQuantity();
        currLitters += liters;
        super.setFuelQuantity(currLitters);
    }
}
