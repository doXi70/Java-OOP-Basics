package p05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // A Car’s Model is unique - there will never be 2 cars with the same model.
        Map<String, Car> cars = new LinkedHashMap<>();

        int carsCount = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        while (carsCount-- > 0) {
            String[] carArgs = line.split(" ");

            String model = carArgs[0];
            double fuelAmount = Double.parseDouble(carArgs[1]);
            double fuelLostPerKM = Double.parseDouble(carArgs[2]);

            cars.putIfAbsent(model, new Car(model, fuelAmount, fuelLostPerKM));
            line = reader.readLine();
        }


        while (!"End".equals(line)) {
            String[] tokens = line.split(" ");
            String carModel = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            Car car = cars.get(carModel);
            try {
                car.drive(distance);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            line = reader.readLine();
        }

        cars.values().forEach(System.out::println);
    }
}
