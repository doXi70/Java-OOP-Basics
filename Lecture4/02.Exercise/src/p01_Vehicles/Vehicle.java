package p01_Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    public static final DecimalFormat FORMAT = new DecimalFormat("#.00");
    private double fuelQuantity;
    private double fuelConsumption;


    public abstract void drive(double distance);

    public abstract void refuel(double liters);

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
