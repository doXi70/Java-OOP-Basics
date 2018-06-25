package p02_VehiclesExtention.vehicles;

import p02_VehiclesExtention.exceptions.distance.InvalidDistanceException;
import p02_VehiclesExtention.exceptions.fuel.InvalidFuelQuantityException;
import p02_VehiclesExtention.exceptions.fuel.InvalidTankCapacityException;

import static p02_VehiclesExtention.constants.Constants.*;

public abstract class BaseVehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public BaseVehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    public void drive(double distance) {
        double litersSpend = distance * this.getFuelConsumption();
        if (litersSpend > this.getFuelQuantity()) {
            throw new InvalidDistanceException(String.format("%s %s",
                    this.getClass().getSimpleName(), NOT_ENOUGH_FUEL_ERROR_MESSAGE));
        } else {
            double currLitters = this.getFuelQuantity();
            currLitters -= litersSpend;

            this.setFuelQuantity(currLitters);
            System.out.println(String.format("%s %s %s %s",
                    this.getClass().getSimpleName(),
                    TRAVELED_MSG,
                    TRAVEL_DISTANCE_FORMAT.format(distance),
                    KM_MSG));
        }
    }


    public void refuel(double liters) {
        if (liters <= VEHICLE_MIN_FUEL_VALUE) {
            throw new InvalidFuelQuantityException(INVALID_FUEL_QUANTITY_MESSAGE);
        }

        if (this.getFuelQuantity() + liters > this.tankCapacity) {
            throw new InvalidTankCapacityException(CANNOT_FIT_FUEL_ERROR_MESSAGE);
        }


        this.fuelQuantity += liters;
    }


    public double getTankCapacity() {
        return this.tankCapacity;
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                Math.round(this.getFuelQuantity() * ONE_HUNDRED_PERCENT) / ONE_HUNDRED_PERCENT);
    }
}
