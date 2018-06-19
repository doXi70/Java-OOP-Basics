package p04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private List<Person> firstTeam;
    private List<Person> reverseTeam;

    public Team() {
        this.firstTeam = new ArrayList<>();
        this.reverseTeam = new ArrayList<>();
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReverseTeam() {
        return Collections.unmodifiableList(reverseTeam);
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reverseTeam.add(person);
        }
    }

    @Override
    public String toString() {
        return String.format("First team have %d players%nReserve team have %d players",
                this.getFirstTeam().size(), this.getReverseTeam().size());
    }
}
