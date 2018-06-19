package p10_FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine();
        Map<String, Person> peopleByName = new HashMap<>();
        Map<String, Person> peopleByBirthdate = new HashMap<>();
        List<String> lines = new ArrayList<>();
        for (String line = reader.readLine(); !line.equals("End"); line = reader.readLine()) {
            if (!line.contains(" - ")) {
                int splitIndex = line.lastIndexOf(" ");
                String name = line.substring(0, splitIndex);
                String date = line.substring(splitIndex + 1);
                Person person = new Person(name, date);
                peopleByName.put(name, person);
                peopleByBirthdate.put(date, person);
            } else {
                lines.add(line);
            }
        }
        String dateRegex = "\\d{1,2}/\\d{1,2}/\\d{4}";
        for (String line : lines) {
            addConnection(peopleByName, peopleByBirthdate, dateRegex, line);
        }
        Person targetPerson;
        if (target.matches(dateRegex)) {
            targetPerson = peopleByBirthdate.get(target);
        } else {
            targetPerson = peopleByName.get(target);
        }
        printOutput(targetPerson);
    }

    private static void addConnection(Map<String, Person> peopleByName
            , Map<String, Person> peopleByBirthdate, String dateRegex, String line) {
        String[] tokens = line.split(" - ");
        Person parent;
        Person child;
        if (tokens[0].matches(dateRegex)) {
            parent = peopleByBirthdate.get(tokens[0]);
        } else {
            parent = peopleByName.get(tokens[0]);
        }
        if (tokens[1].matches(dateRegex)) {
            child = peopleByBirthdate.get(tokens[1]);
        } else {
            child = peopleByName.get(tokens[1]);
        }
        parent.getChildren().add(child);
        child.getParents().add(parent);
    }

    private static void printOutput(Person targetPerson) {
        StringBuilder sb = new StringBuilder();
        sb.append(targetPerson).append(System.lineSeparator())
                .append("Parents:").append(System.lineSeparator());
        for (Person parent : targetPerson.getParents()) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Person child : targetPerson.getChildren()) {
            sb.append(child).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}