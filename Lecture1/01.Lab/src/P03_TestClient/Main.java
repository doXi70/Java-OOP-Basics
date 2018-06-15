package P03_TestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");
            int id = Integer.parseInt(tokens[1]);

            switch (tokens[0]) {
                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                        continue;
                    } else {
                        accounts.put(id, new BankAccount(id));
                    }
                    break;
                case "Deposit":
                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                        continue;
                    } else {
                        double amount = Double.parseDouble(tokens[2]);
                        BankAccount account = accounts.get(id);
                        account.deposit(amount);
                    }
                    break;
                case "Withdraw":
                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                        continue;
                    } else {
                        double amount = Double.parseDouble(tokens[2]);
                        BankAccount account = accounts.get(id);
                        account.withdraw(amount);
                    }
                    break;
                case "Print":
                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                        continue;
                    } else {
                        BankAccount account = accounts.get(id);
                        System.out.println(account);
                    }
                    break;
            }
        }
    }
}
