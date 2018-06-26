package p01_DefineAnInterfacePerson;

public class Citizen implements Person {
    private String name;
    private int age;

    public Citizen(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }
}
