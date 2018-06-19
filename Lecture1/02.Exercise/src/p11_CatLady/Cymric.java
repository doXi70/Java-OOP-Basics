package p11_CatLady;

public class Cymric extends Cat {
    private double furLen;

    public Cymric(String name, double furLen) {
        super(name);
        this.furLen = furLen;
    }

    public double getFurLen() {
        return this.furLen;
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
                this.getFurLen());
    }
}
