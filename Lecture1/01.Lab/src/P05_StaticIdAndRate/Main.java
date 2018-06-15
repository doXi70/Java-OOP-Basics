package P05_StaticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("#.#############################");

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Create":
                    createAccount(accounts);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);

                    if (accounts.containsKey(id)) {
                        BankAccount account = accounts.get(id);
                        account.deposit(amount);
                        System.out.printf("Deposited %s to ID%d%n", df.format(amount), account.getId());
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "GetInterest":
                    int id2 = Integer.parseInt(tokens[1]);
                    if (accounts.containsKey(id2)) {
                        BankAccount account = accounts.get(id2);
                        int years = Integer.parseInt(tokens[2]);
                        System.out.printf("%.2f%n", account.getInterestRate(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.rate = Double.parseDouble(tokens[1]);
                    break;
            }
        }
    }

    private static void createAccount(Map<Integer, BankAccount> accounts) {
        BankAccount account = new BankAccount();
        accounts.putIfAbsent(account.getId(), account);
        System.out.printf("Account ID%d created%n", account.getId());
    }
}
