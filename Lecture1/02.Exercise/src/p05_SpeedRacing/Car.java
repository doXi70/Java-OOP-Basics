package p05_SpeedRacing;

public class Car {
    private final static int STARTING_DISTANCE_TRAVELED = 0;

    private String model;
    private double fuelAmount;
    private double fuelCostPerKM;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKM = fuelCostPerKM;
        this.distanceTraveled = STARTING_DISTANCE_TRAVELED;
    }

    public void drive(int distanceInKM) {
        if (distanceInKM > calcKMthatCanBeTravelled()) {
            throw new IllegalArgumentException("Insufficient fuel for the drive");
        }

        this.fuelAmount -= calcFuelLost(distanceInKM);
        this.distanceTraveled += distanceInKM;
    }

    private int calcKMthatCanBeTravelled() {
        return (int) (this.fuelAmount / this.fuelCostPerKM);
    }

    private double calcFuelLost(int distance) {
        return this.fuelCostPerKM * distance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f",
                this.model, this.fuelAmount, this.distanceTraveled);
    }
}
