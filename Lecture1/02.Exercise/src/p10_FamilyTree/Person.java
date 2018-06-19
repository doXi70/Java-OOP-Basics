package p10_FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private List<Person> parents;
    private List<Person> children;

    public Person(String fullName, String dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.parents = new ArrayList<>(2);
        this.children = new ArrayList<>();
    }

    public List<Person> getParents() {
        return this.parents;
    }

    public List<Person> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.fullName, this.dateOfBirth);
    }
}