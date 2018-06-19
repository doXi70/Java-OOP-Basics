package p11_CatLady;

public class StreetExtraordinaire extends Cat {
    private double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    public double getDecibelsOfMeows() {
        return this.decibelsOfMeows;
    }

    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",
                this.getClass().getSimpleName(),
                this.getName(),
                this.getDecibelsOfMeows());
    }
}
