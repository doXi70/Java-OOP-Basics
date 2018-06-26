package p06_BirthdayCelebrations;

public class Pet extends Indentifiable implements Birthable {
    private String name;

    public Pet(String name, String birthdate) {
        super(birthdate);
        this.name = name;
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
