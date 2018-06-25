package p02_VehiclesExtention.constants;

import java.text.DecimalFormat;

public final class Constants {
    public final static String INVALID_FUEL_QUANTITY_MESSAGE = "Fuel must be a positive number";
    public final static String CANNOT_FIT_FUEL_ERROR_MESSAGE = "Cannot fit fuel in tank";
    public final static String NOT_ENOUGH_FUEL_ERROR_MESSAGE = "needs refueling";
    public final static String TRAVELED_MSG = "travelled";
    public final static String KM_MSG = "km";

    public final static double CAR_AIR_CONDITION_MODE_ON = 0.9;
    public final static double TRUCK_AIR_CONDITION_MODE_ON = 1.6;
    public final static double BUS_AIR_CONDITION_MODE_ON = 1.4;

    public final static DecimalFormat TRAVEL_DISTANCE_FORMAT = new DecimalFormat("0.##");
    public final static int VEHICLE_MIN_FUEL_VALUE = 0;
    public final static double TRUCK_REFUEL_PERCENTAGE = 95;

    // xD when you don't know how to name your magical number
    public final static double ONE_HUNDRED_PERCENT = 100.0;

    // naming constants is fun
    public final static int ONE_HUNDRED_PERCENT_THE_INTEGER_ONE = 100;

    private Constants() {

    }
}
