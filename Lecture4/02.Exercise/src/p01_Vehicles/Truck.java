package p01_Vehicles;

import java.text.DecimalFormat;

@SuppressWarnings("Duplicates")
public class Truck extends Vehicle {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Truck(double fuelQuantity, double fuelConsumption) {

        double actualFuelConsumption = fuelConsumption + 1.6;

        super.setFuelQuantity(fuelQuantity);
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
        currLitters += (liters * 0.95);
        super.setFuelQuantity(currLitters);
    }
}
