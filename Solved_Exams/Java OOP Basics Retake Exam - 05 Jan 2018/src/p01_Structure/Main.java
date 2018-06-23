package p01_Structure;

import p01_Structure.colonists.medics.GeneralPractitioner;
import p01_Structure.colonists.medics.Medic;
import p01_Structure.colonists.medics.Surgeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split(" ");

        switch (tokens[0]) {
            case "insert":
                if ("Surgeon".equals(tokens[1])) {
                    Medic surgeon = new Surgeon(tokens[2], tokens[3], Integer.parseInt(tokens[4]),
                            Integer.parseInt(tokens[5]), tokens[6]);


                } else if ("GeneralPractitioner".equals(tokens[1])) {
                    Medic gp = new GeneralPractitioner(tokens[2], tokens[3], Integer.parseInt(tokens[4]),
                            Integer.parseInt(tokens[5]), tokens[6]);


                } else {
                    switch (tokens[1]) {
                        case "Soldier":

                            break;
                        case "SoftwareEngineer":

                            break;
                        case "HardwareEngineer":

                            break;
                    }
                }
                break;
            case "remove":
                break;
            case "grow":
                break;
            case "potential":
                break;
            case "capacity":
                break;
        }
    }
}
