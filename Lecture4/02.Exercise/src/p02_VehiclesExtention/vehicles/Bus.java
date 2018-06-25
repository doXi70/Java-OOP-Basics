package p02_VehiclesExtention.vehicles;

import p02_VehiclesExtention.exceptions.distance.InvalidDistanceException;

import static p02_VehiclesExtention.constants.Constants.BUS_AIR_CONDITION_MODE_ON;

public class Bus extends BaseVehicle {
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + BUS_AIR_CONDITION_MODE_ON, tankCapacity);
    }

    public void driveEmpty(double distance) {
        setAirConditionerOff();
        try {
            super.drive(distance);
        } catch (InvalidDistanceException ide) {
            throw new InvalidDistanceException(ide.getMessage());
        } finally {
            setAirConditionerOn();
        }
    }

    private void setAirConditionerOn() {
        double consumption = super.getFuelConsumption() + BUS_AIR_CONDITION_MODE_ON;
        super.setFuelConsumption(consumption);
    }

    private void setAirConditionerOff() {
        double consumption = super.getFuelConsumption() - BUS_AIR_CONDITION_MODE_ON;
        super.setFuelConsumption(consumption);
    }
}
