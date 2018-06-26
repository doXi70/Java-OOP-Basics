package p07_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Buyer> units = new LinkedHashMap<>();

        int linesCount = Integer.parseInt(reader.readLine());
        while (linesCount-- > 0) {
            String[] tokens = reader.readLine().split(" ");

            switch (tokens.length) {
                case 3:
                    units.putIfAbsent(tokens[0], new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
                    break;
                case 4:
                    units.putIfAbsent(tokens[0], new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
                    break;
            }
        }

        String buyerName;
        while (!"End".equals(buyerName = reader.readLine())) {
            if (units.containsKey(buyerName)) {
                Buyer buyer = units.get(buyerName);
                buyer.buyFood();
            }
        }

        int totalFood = units.entrySet().stream()
                .mapToInt(buyer -> buyer.getValue().getFood())
                .sum();

        System.out.println(totalFood);
    }
}
