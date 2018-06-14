package p06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FRAGILE_CARGO_TYPE = "fragile";
    private static final String FLAMABLE_CARGO_TYPE = "flamable";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputLines = Integer.parseInt(reader.readLine());
        List<Car> cars = new ArrayList<>();

        String line = reader.readLine();
        while (inputLines-- > 0) {
            String[] tokens = line.split(" ");

            Model model = getCarModel(tokens[0]);
            Engine engine = getCarEngine(tokens[1], tokens[2]);
            Cargo cargo = getCarCargo(tokens[3], tokens[4]);
            Tire[] tires = getCarTires(tokens[5], tokens[6], tokens[7], tokens[8],
                    tokens[9], tokens[10], tokens[11], tokens[12]);

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
            line = reader.readLine();
        }

        switch (line.toLowerCase()) {
            case "fragile":
                cars.stream()
                        .filter(car ->
                                car.getCargoType().toLowerCase().equals(FRAGILE_CARGO_TYPE)
                                        && car.isTirePressureBelowOne())
                        .forEach(System.out::println);

                break;
            case "flamable":
                cars.stream()
                        .filter(car ->
                                car.getCargoType().toLowerCase().equals(FLAMABLE_CARGO_TYPE)
                                        && car.isEnginePowerAbove250())
                        .forEach(System.out::println);
                break;
        }
    }

    private static Tire[] getCarTires(String pressure1, String age1,
                                      String pressure2, String age2,
                                      String pressure3, String age3,
                                      String pressure4, String age4) {


        double tier1Pressure = Double.parseDouble(pressure1);
        int tire1Age = Integer.parseInt(age1);

        double tier2Pressure = Double.parseDouble(pressure2);
        int tire2Age = Integer.parseInt(age2);

        double tier3Pressure = Double.parseDouble(pressure3);
        int tire3Age = Integer.parseInt(age3);

        double tier4Pressure = Double.parseDouble(pressure4);
        int tire4Age = Integer.parseInt(age4);

        Tire[] tires = new Tire[4];
        tires[0] = new Tire(tier1Pressure, tire1Age);
        tires[1] = new Tire(tier2Pressure, tire2Age);
        tires[2] = new Tire(tier3Pressure, tire3Age);
        tires[3] = new Tire(tier4Pressure, tire4Age);

        return tires;
    }

    private static Cargo getCarCargo(String weight, String type) {
        int cargoWeight = Integer.parseInt(weight);
        String cargoType = type;

        return new Cargo(cargoWeight, cargoType);
    }

    private static Engine getCarEngine(String speed, String power) {
        int engineSpeed = Integer.parseInt(speed);
        int enginePower = Integer.parseInt(power);

        return new Engine(engineSpeed, enginePower);
    }

    private static Model getCarModel(String name) {
        return new Model(name);
    }


}
