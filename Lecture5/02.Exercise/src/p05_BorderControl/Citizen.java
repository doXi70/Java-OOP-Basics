package p05_BorderControl;

public class Citizen extends Indentifiable {
    private String name;
    private Integer age;

    public Citizen(String name, Integer age, String id) {
        super(id);
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean check(String fakeIdEnd) {
        if (super.getId().endsWith(fakeIdEnd)) {
            return true;
        }

        return false;
    }
}
