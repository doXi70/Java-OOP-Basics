package p02_VehiclesExtention.vehicles;

import p02_VehiclesExtention.exceptions.fuel.InvalidFuelQuantityException;
import p02_VehiclesExtention.exceptions.fuel.InvalidTankCapacityException;

import static p02_VehiclesExtention.constants.Constants.*;

public class Truck extends BaseVehicle {
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + TRUCK_AIR_CONDITION_MODE_ON, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        if (liters <= VEHICLE_MIN_FUEL_VALUE) {
            throw new InvalidFuelQuantityException(INVALID_FUEL_QUANTITY_MESSAGE);
        }

        double totalLiters = super.getFuelQuantity() + ((liters * TRUCK_REFUEL_PERCENTAGE) / ONE_HUNDRED_PERCENT_THE_INTEGER_ONE);
        if (totalLiters > super.getTankCapacity()) {
            throw new InvalidTankCapacityException(CANNOT_FIT_FUEL_ERROR_MESSAGE);
        }

        super.setFuelQuantity(totalLiters);
    }
}
