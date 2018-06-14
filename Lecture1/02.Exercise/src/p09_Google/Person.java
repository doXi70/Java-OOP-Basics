package p09_Google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private static final String DEFAULT_VALUE_FOR_NULL = "%n";
    private static final String LINE = System.lineSeparator();

    private String name;
    private Car car;
    private Company company;
    private List<Parent> parents;
    private List<Children> childrens;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.childrens = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Parent> getParents() {
        return Collections.unmodifiableList(this.parents);
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Children> getChildrens() {
        return Collections.unmodifiableList(this.childrens);
    }

    public void setChildrens(List<Children> childrens) {
        this.childrens = childrens;
    }

    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(this.pokemons);
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addChildren(Children children) {
        this.childrens.add(children);
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    @Override
    public String toString() {
        StringBuilder pokemonz = new StringBuilder(LINE);
        StringBuilder parentz = new StringBuilder(LINE);
        StringBuilder childrenz = new StringBuilder(LINE);

        for (Pokemon pokemon : pokemons) {
            pokemonz.append(pokemon).append(System.lineSeparator());
        }

        for (Parent parent : parents) {
            parentz.append(parent).append(System.lineSeparator());
        }

        for (Children children : childrens) {
            childrenz.append(children).append(System.lineSeparator());
        }

        StringBuilder companz = new StringBuilder();
        if (this.company == null) {
            companz.append(LINE);
        } else {
            companz.append(this.company);
        }

        StringBuilder carz = new StringBuilder();
        if (this.car == null) {
            carz.append(LINE);
        } else {
            carz.append(car);
        }

        StringBuilder result = new StringBuilder();

        result.append(this.name).append(LINE)
                .append("Company:").append(companz)
                .append("Car:").append(carz)
                .append("Pokemon:").append(pokemonz)
                .append("Parents:").append(parentz)
                .append("Children:").append(childrenz);

        return result.toString();
    }
}
// String.format("%s%nCompany:%n%s%nCar:%n%s%n" +
//                        "Pokemon:%n%sParents:%n%sChildren:%n%s",
//                this.name, companz, carz, pokemonz.toString(), parentz.toString(), childrenz.toString());
