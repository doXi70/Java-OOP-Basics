package p11_CatLady;

public abstract class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    protected abstract String getName();
}
