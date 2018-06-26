package p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] phones = reader.readLine().split("\\s+");
        String[] webSites = reader.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone(phones, webSites);
        smartphone.call();
        smartphone.browse();

    }
}
