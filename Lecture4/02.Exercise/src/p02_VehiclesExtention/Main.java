package p02_VehiclesExtention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));

        String[] truckTokens = reader.readLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        int cmdsCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cmdsCount; i++) {
            String[] tokens = reader.readLine().split(" ");
            String cmd = tokens[0];
            String vehicleType = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            if (cmd.equals("Drive")) {
                if (vehicleType.equals("Car")) {
                    car.drive(amount);
                } else {
                    truck.drive(amount);
                }
            } else {
                if (vehicleType.equals("Car")) {
                    car.refuel(amount);
                } else {
                    truck.refuel(amount);
                }
            }
        }

        System.out.println(String.format("Car: %.2f", Math.round(car.getFuelQuantity() * 100.0) / 100.0));
        System.out.println(String.format("Truck: %.2f", Math.round(truck.getFuelQuantity() * 100.0) / 100.0));
        System.out.println();
    }
}
