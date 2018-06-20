package p04_MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] foodEaten = reader.readLine().toLowerCase().split(" ");

        Gandalf gandalf = new Gandalf();
        gandalf.modifyMood(foodEaten);
        System.out.println(gandalf.getMood());
        System.out.println(gandalf.getGandalfMoodType());
    }
}
