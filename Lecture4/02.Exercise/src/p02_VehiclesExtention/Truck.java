package p02_VehiclesExtention;

import java.text.DecimalFormat;

@SuppressWarnings("Duplicates")
public class Truck extends Vehicle {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Truck(double fuelQuantity, double fuelConsumption, double tankConsumption) {
        super(fuelQuantity, fuelConsumption, tankConsumption);
        double actualFuelConsumption = fuelConsumption + 1.6;
        super.setFuelConsumption(actualFuelConsumption);
    }

    @Override
    public void drive(double distance) {
        double litersSpend = distance * super.getFuelConsumption();
        if (litersSpend > super.getFuelQuantity()) {
            System.out.println("Truck needs refueling");
        } else {
            double currLitters = super.getFuelQuantity();
            currLitters -= litersSpend;
            super.setFuelQuantity(currLitters);

            System.out.println(String.format("Truck travelled %s km", decimalFormat.format(distance)));
        }
    }

    @Override
    public void refuel(double liters) {
        double currLitters = super.getFuelQuantity();
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        currLitters += liters;
        if (getTankCapacity() < liters) {
            throw new IllegalArgumentException("Cannot fit in tank");
        }

        super.setFuelQuantity(currLitters);
    }
}
