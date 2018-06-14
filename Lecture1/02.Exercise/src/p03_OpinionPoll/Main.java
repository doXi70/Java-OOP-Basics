package p03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();
        int linesCount = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        for (int i = 0; i < linesCount; i++) {
            String[] tokens = line.split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            persons.add(person);

            line = reader.readLine();
        }

        List<Person> sortedPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 30) {
                sortedPersons.add(person);
            }
        }

        Collections.sort(sortedPersons);
        for (Person sortedPerson : sortedPersons) {
            System.out.println(sortedPerson);
        }
    }
}
