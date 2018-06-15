package p02_ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double boxLen = Double.parseDouble(reader.readLine());
        Double boxWidth = Double.parseDouble(reader.readLine());
        Double boxHeight = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(boxLen, boxWidth, boxHeight);
            System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume - %.2f%n", box.calculateVolume());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}
