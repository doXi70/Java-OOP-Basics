package p05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Indentifiable> units = new ArrayList<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");

            if (tokens.length == 2) {
                units.add(new Soldier(tokens[0], tokens[1]));
            } else {
                units.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String fakeId = reader.readLine();
        List<String> fakeUnitIds = new ArrayList<>();
        for (Indentifiable unit : units) {
            if (unit.check(fakeId)) {
                fakeUnitIds.add(unit.getId());
            }
        }

        for (String fakeUnitId : fakeUnitIds) {
            System.out.println(fakeUnitId);
        }
    }
}
