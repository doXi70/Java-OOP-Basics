package p08_PokemonTrainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trainer {
    private static final int BADGES_START_VALUE = 0;

    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public Trainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
        this.numberOfBadges = BADGES_START_VALUE;
    }

    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(this.pokemons);
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemon != null) {
            this.pokemons.add(pokemon);
        } else {
            throw new IllegalArgumentException("Invalid pokemon.");
        }
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    public void battle(String type) {
        boolean hasElement = true;

        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(type)) {
                this.numberOfBadges++;
                hasElement = false;
                break;
            }
        }

        if (hasElement) {
            this.pokemonsTake10DMG();
        }
    }

    private void pokemonsTake10DMG() {
        for (int i = 0; i < pokemons.size(); i++) {
            pokemons.get(i).setHealth(pokemons.get(i).getHealth() - 10);

            if (pokemons.get(i).getHealth() <= 0) {
                pokemons.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",
                this.name, this.numberOfBadges, this.pokemons.size());
    }
}
