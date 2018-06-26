package p05_BorderControl;

public class Soldier extends Indentifiable {
    private String model;

    public Soldier(String model, String id) {
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
