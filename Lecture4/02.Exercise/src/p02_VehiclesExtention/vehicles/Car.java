package p02_VehiclesExtention.vehicles;

import static p02_VehiclesExtention.constants.Constants.CAR_AIR_CONDITION_MODE_ON;

public class Car extends BasicVehicle {
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + CAR_AIR_CONDITION_MODE_ON, tankCapacity);
    }
}
