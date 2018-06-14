package p06_RawData;

public class Tire {
    private int age;
    private double pressure;

    public Tire(double pressure, int age) {
        this.age = age;
        this.pressure = pressure;
    }

    public double getPressure() {
        return this.pressure;
    }
}
