package p06_BirthdayCelebrations;

public class Citizen extends Indentifiable implements Birthable {
    private String name;
    private Integer age;


    public Citizen(String name, Integer age, String id, String birthdate) {
        super(id, birthdate);
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean check(String fakeIdEnd) {
        return super.getId().endsWith(fakeIdEnd);
    }

    @Override
    public boolean checkBirthYear(String year) {
        return this.getBirthdate().endsWith(year);
    }

    @Override
    public String getBirthdate() {
        return super.getBirthdate();
    }
}
