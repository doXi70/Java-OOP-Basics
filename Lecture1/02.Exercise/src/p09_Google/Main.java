package p09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> peoples = new LinkedHashMap<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");
            String personName = tokens[0];
            peoples.putIfAbsent(personName, new Person(personName));
            Person person = peoples.get(personName);

            switch (tokens[1]) {
                case "company":
                    String companyName = tokens[2];
                    String departmentName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);

                    Company company = new Company(companyName, departmentName, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];

                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.addPokemon(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];

                    Parent parent = new Parent(parentName, parentBirthday);
                    person.addParent(parent);
                    break;
                case "children":
                    String childenName = tokens[2];
                    String childenBirthday = tokens[3];

                    Children children = new Children(childenName, childenBirthday);
                    person.addChildren(children);
                    break;
                case "car":
                    String carName = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);

                    Car car = new Car(carName, carSpeed);
                    person.setCar(car);
                    break;
            }
        }
        String personToPrintName = reader.readLine();

        Person wantedPerson = peoples.get(personToPrintName);
        System.out.println(wantedPerson);
    }
}
