package p08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String line;
        while (!"Tournament".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");

            String trainerName = tokens[0];
            trainers.putIfAbsent(trainerName, new Trainer(trainerName));

            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHP = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHP);

            trainers.get(trainerName).addPokemon(pokemon);
        }

        while (!"End".equals(line = reader.readLine())) {
            String element = line;
            trainers.forEach((key, value) -> value.battle(element));
        }

        trainers.entrySet().stream()
                .sorted((t1, t2) ->
                        Integer.compare(
                                t2.getValue().getNumberOfBadges(),
                                t1.getValue().getNumberOfBadges()))
                .forEach(trainer -> System.out.println(trainer.getValue()));

        System.out.println();
    }
}
