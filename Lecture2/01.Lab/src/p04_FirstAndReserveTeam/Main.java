package p04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Team team = new Team();
        int peopleCount = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        while (peopleCount-- > 0) {
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);

            Person person;
            try {
                person = new Person(firstName, lastName, age, salary);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                line = reader.readLine();
                continue;
            }

            team.addPlayer(person);
            if (peopleCount != 0) {
                line = reader.readLine();
            }

        }

        System.out.println(team);
    }
}
