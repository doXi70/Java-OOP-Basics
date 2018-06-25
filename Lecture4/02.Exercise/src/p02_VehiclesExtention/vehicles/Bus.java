package p02_VehiclesExtention.vehicles;

import static p02_VehiclesExtention.constants.Constants.BUS_AIR_CONDITION_MODE_ON;

public class Bus extends BasicVehicle {
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + BUS_AIR_CONDITION_MODE_ON, tankCapacity);
    }

    public void driveEmpty(double distance) {
        setAirConditionerOff();
        super.drive(distance);
        setAirConditionerOn();
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
