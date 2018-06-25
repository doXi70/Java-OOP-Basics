package p02_VehiclesExtention;

import p02_VehiclesExtention.exceptions.ApplicationException;
import p02_VehiclesExtention.vehicles.Bus;
import p02_VehiclesExtention.vehicles.Car;
import p02_VehiclesExtention.vehicles.Truck;
import p02_VehiclesExtention.vehicles.BasicVehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split(" ");
        BasicVehicle car = new Car(Double.parseDouble(carTokens[1]),
                Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));

        String[] truckTokens = reader.readLine().split(" ");
        BasicVehicle truck = new Truck(Double.parseDouble(truckTokens[1]),
                Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));

        String[] busTokens = reader.readLine().split(" ");
        BasicVehicle bus = new Bus(Double.parseDouble(busTokens[1]),
                Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));


        int cmdsCount = Integer.parseInt(reader.readLine());
        while (cmdsCount-- > 0) {
            String[] command = reader.readLine().split(" ");
            String action = command[0];
            String vehicle = command[1];
            double amount = Double.parseDouble(command[2]);

            try {
                executeAction(car, truck, bus, action, vehicle, amount);
            } catch (ApplicationException ae) {
                System.out.println(ae.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void executeAction(BasicVehicle car, BasicVehicle truck, BasicVehicle bus,
                                      String action, String vehicle, double amount) {
        switch (action) {
            case "Refuel":
                refuelVehicle(car, truck, bus, vehicle, amount);
                break;
            case "Drive":
                driveVehicle(car, truck, bus, vehicle, amount);
                break;
            case "DriveEmpty":
                // Only possible for bus!
                ((Bus) bus).driveEmpty(amount);
                break;
        }
    }

    private static void driveVehicle(BasicVehicle car, BasicVehicle truck, BasicVehicle bus,
                                     String vehicle, double amount) {
        switch (vehicle) {
            case "Car":
                car.drive(amount);
                break;
            case "Truck":
                truck.drive(amount);
                break;
            case "Bus":
                bus.drive(amount);
                break;
        }
    }

    private static void refuelVehicle(BasicVehicle car, BasicVehicle truck, BasicVehicle bus,
                                      String vehicle, double amount) {
        switch (vehicle) {
            case "Car":
                car.refuel(amount);
                break;
            case "Truck":
                truck.refuel(amount);
                break;
            case "Bus":
                bus.refuel(amount);
                break;
        }
    }
}
