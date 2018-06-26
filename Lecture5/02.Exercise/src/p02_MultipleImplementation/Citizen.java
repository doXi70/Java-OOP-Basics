package p02_MultipleImplementation;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.setId(id);
        this.setBirthDate(birthDate);
        this.setName(name);
        this.setAge(age);
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

    protected void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String Birthdate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    protected void setId(String id) {
        this.id = id;
    }
}
