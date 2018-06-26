package p06_BirthdayCelebrations;

public class Robot extends Indentifiable {
    private String model;

    public Robot(String model, String id) {
        super(id);
        this.model = model;
    }

    @Override
    public boolean check(String fakeIdEnd) {
        if (super.getId().endsWith(fakeIdEnd)) {
            return true;
        }

        return false;
    }
}
