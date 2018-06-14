package p07_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int enginesAmount = Integer.parseInt(reader.readLine());

        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        String line = reader.readLine();
        while (enginesAmount-- > 0) {
            String[] tokens = line.split(" ");

            String model = tokens[0];
            String power = tokens[1];
            Engine engine = new Engine(model, power);

            switch (tokens.length) {
                case 2:
                    break;
                case 3:
                    if (tokens[2].matches("\\d+")) {
                        String displacement = tokens[2];
                        engine.setDisplacement(displacement);
                    } else {
                        String efficiency = tokens[2];
                        engine.setEfficiency(efficiency);
                    }

                    break;
                case 4:
                    String displacement = tokens[2];
                    String efficiency = tokens[3];

                    engine.setDisplacement(displacement);
                    engine.setEfficiency(efficiency);
                    break;
            }

            engines.putIfAbsent(model, engine);
            line = reader.readLine();
        }

        int carsAmount = Integer.parseInt(line);
        while (carsAmount-- > 0) {
            line = reader.readLine();
            String[] tokens = line.split(" ");
            String model = tokens[0];


            String engineModel = tokens[1];
            Engine engine = getCarEngine(engines, engineModel);

            Car car = new Car(model, engine);
            switch (tokens.length) {
                case 2:
                    break;
                case 3:
                    if (tokens[2].matches("\\d+")) {
                        car.setWeight(tokens[2]);
                    } else {
                        car.setColor(tokens[2]);
                    }
                    break;
                case 4:
                    String weight = tokens[2];
                    String color = tokens[3];
                    car.setWeight(weight);
                    car.setColor(color);
                    break;
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

    }

    private static Engine getCarEngine(Map<String, Engine> engines,
                                       String engineModel) {

        // it must aways have the model inside the map.
        return engines.get(engineModel);
    }
}
