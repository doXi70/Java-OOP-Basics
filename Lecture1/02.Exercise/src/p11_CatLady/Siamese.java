package p11_CatLady;

public class Siamese  extends Cat{
    private double earSize;

    public Siamese(String name, double earSize) {
        super(name);
        this.earSize = earSize;
    }

    public double getEarSize() {
        return this.earSize;
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
                this.getEarSize());
    }
}
