package p03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] studentTokens = reader.readLine().split(" ");
            Student student = new Student(studentTokens[0], studentTokens[1], studentTokens[2]);

            String[] workerTokens = reader.readLine().split(" ");
            Worker worker = new Worker(workerTokens[0], workerTokens[1],
                    Double.parseDouble(workerTokens[2]),Double.parseDouble(workerTokens[3]));

            System.out.println(student);
            System.out.println(worker);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
