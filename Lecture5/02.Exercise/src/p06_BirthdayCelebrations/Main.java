package p06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> units = new ArrayList<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Citizen":
                    units.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
               case "Pet":
                    units.add(new Pet(tokens[1], tokens[2]));
                    break;
            }
        }

        String year = reader.readLine();
        List<String> birthdates = new ArrayList<>();
        for (Birthable unit : units) {
            if (unit.checkBirthYear(year)) {
                birthdates.add(unit.getBirthdate());
            }
        }

        for (String birthdate : birthdates) {
            System.out.println(birthdate);
        }
    }
}
