package p05_BorderControl;

public abstract class Indentifiable implements BorderControl {
    private String id;

    public Indentifiable(String id) {
        this.id = id;
    }

    protected String getId() {
        return this.id;
    }
}
