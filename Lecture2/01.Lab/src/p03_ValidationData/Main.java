package p03_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        int peopleCount = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        while (peopleCount-- > 0) {
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double bonus = Double.parseDouble(tokens[3]);

            Person person = null;
            try {
                person = new Person(firstName, lastName, age, bonus);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                line = reader.readLine();
                continue;
            }

            people.add(person);
            line = reader.readLine();
        }

        double bonus = Double.parseDouble(line);
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
