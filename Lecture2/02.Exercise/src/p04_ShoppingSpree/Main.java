package p04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String REGEX = "[=;]+";


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        try {
            getPersonsInput(reader, people, REGEX);
            getProductsInput(reader, products, REGEX);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];

            Person person = people.get(personName);
            Product product = products.get(productName);
            try {
                System.out.println(person.buyProduct(product));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        people.forEach((key, person) -> {
            StringBuilder sb = new StringBuilder();

            sb.append(person.getName()).append(" - ");

            List<Product> personBagOfProducts = person.getBagOfProducts();
            if (!personBagOfProducts.isEmpty()) {
                for (Product product : personBagOfProducts) {
                    sb.append(product.getName()).append(", ");
                }
                sb.replace(sb.length() - 2, sb.length(), "");
                System.out.println(sb);
            } else {
                sb.append("Nothing bought");
                System.out.println(sb);
            }


        });
    }

    private static void getPersonsInput(BufferedReader reader,
                                        Map<String, Person> people,
                                        String regex) throws IOException {

        String line = reader.readLine();
        String[] tokens = line.split(regex);

        for (int i = 0; i < tokens.length; i += 2) {
            String name = tokens[i];
            double money = Double.parseDouble(tokens[i + 1]);
            Person person = new Person(name, money);
            people.putIfAbsent(name, person);
        }
    }

    private static void getProductsInput(BufferedReader reader,
                                         Map<String, Product> products,
                                         String regex) throws IOException {

        String line = reader.readLine();
        String[] tokens = line.split(regex);

        for (int i = 0; i < tokens.length; i += 2) {
            String name = tokens[i];
            double cost = Double.parseDouble(tokens[i + 1]);

            Product product = new Product(name, cost);
            products.putIfAbsent(name, product);
        }
    }
}
