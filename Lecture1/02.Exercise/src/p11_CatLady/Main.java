package p11_CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Cat> cats = new ArrayList<>();


        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");
            String type = tokens[0];
            String name = tokens[1];

            if (type.equals("Siamese")) {
                double earLen = Double.parseDouble(tokens[2]);
                cats.add(new Siamese(name, earLen));
            } else if (type.equals("Cymric")) {
                double furLen = Double.parseDouble(tokens[2]);
                cats.add(new Cymric(name, furLen));
            } else {
                double decibelsOfMeows = Double.parseDouble(tokens[2]);
                cats.add(new StreetExtraordinaire(name, decibelsOfMeows));
            }
        }

        String catName = reader.readLine();
        for (Cat cat : cats) {
            if (cat.getName().equals(catName)) {
                System.out.println(cat);
            }
        }
    }


}
