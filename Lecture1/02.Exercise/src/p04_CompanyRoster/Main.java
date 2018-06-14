package p04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int linesCount = Integer.parseInt(reader.readLine());
        List<Employee> employees = new ArrayList<>();

        String line = reader.readLine();
        while (linesCount-- > 0) {
            String[] tokens = line.split(" ");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departmentName = tokens[3];

            Employee employee = new Employee(name, salary, position, departmentName);
            switch (tokens.length) {
                case 4:
                    break;
                case 5:
                    if (tokens[4].matches("\\d+")) {
                        // they give us the age
                        Integer age = Integer.valueOf(tokens[4]);
                        employee.setAge(age);
                    } else {
                        // they give us the email
                        String email = tokens[4];
                        employee.setEmail(email);
                    }
                    break;
                case 6:
                    String email = tokens[4];
                    Integer age = Integer.valueOf(tokens[5]);

                    employee.setEmail(email);
                    employee.setAge(age);
                    break;
                default:
                    throw new UnsupportedOperationException("Invalid input count of the input parameters.");
            }

            employees.add(employee);
            line = reader.readLine();
        }

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Double.compare(
                        e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                        e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble())
                ).limit(1)
                .forEach(employee -> {
                    StringBuilder result = new StringBuilder();
                    String departmentName = employee.getKey();
                    result.append(String.format("Highest Average Salary: %s", departmentName))
                            .append(NEW_LINE);

                    List<Employee> sortedEmployees = employee.getValue();
                    Collections.sort(sortedEmployees);

                    System.out.print(result);
                    sortedEmployees.forEach(System.out::println);
                });
    }
}
