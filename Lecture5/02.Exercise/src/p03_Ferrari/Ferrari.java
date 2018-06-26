package p03_Ferrari;

public class Ferrari implements Car {
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBreaks() {
        return "Brakes!";
    }

    @Override
    public String pushTheGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
               MODEL, this.useBreaks(), this.pushTheGasPedal(), this.driverName);
    }
}
