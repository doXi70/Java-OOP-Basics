package p02_VehiclesExtention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static p01_Vehicles.Vehicle.FORMAT;

// Factory pattern
// Common pattern
// Dispatcher

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));

        String[] truckTokens = reader.readLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));

        String[] busTokens = reader.readLine().split(" ");
        Vehicle bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        int cmdsCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cmdsCount; i++) {
            String[] tokens = reader.readLine().split(" ");
            String cmd = tokens[0];
            String vehicleType = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            if (cmd.equals("Drive")) {
                driveVehicle(car, truck, bus, vehicleType, amount);
            } else {
                driveVehicle(car, truck, bus, vehicleType, amount);
            }
        }

        System.out.println(String.format("Car: %s", FORMAT.format(car.getFuelQuantity())));
        System.out.println(String.format("Truck: %s", FORMAT.format(truck.getFuelQuantity())));
    }

    private static void driveVehicle(Vehicle car, Vehicle truck,
                                     Vehicle bus, String vehicleType, double amount) {

        switch (vehicleType) {
            case "Car":
                car.drive(amount);
                break;
            case "Bus":
                bus.drive(amount);
                break;
            default:
                truck.drive(amount);
                break;
        }
    }
}
