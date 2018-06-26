package p07_FoodShortage;

public abstract class Indentifiable implements BorderControl {
    private String id;
    private String birthdate;

    public Indentifiable(String birthdate) {
        this.birthdate = birthdate;
    }

    public Indentifiable(String id, String birthdate) {
        this.id = id;
        this.birthdate = birthdate;
    }

    protected String getId() {
        return this.id;
    }

    protected String getBirthdate() {
        return this.birthdate;
    }
}
