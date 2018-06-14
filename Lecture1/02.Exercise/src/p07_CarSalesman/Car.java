package p07_CarSalesman;

public class Car {
    // if field has null value, it must have this value applied;
    private static final String DEFAULT_MISSING_FIELD_VALUE = "n/a";
    private static final String LINE = System.lineSeparator();
    private static final String COLUMNS = ":";

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = DEFAULT_MISSING_FIELD_VALUE;
        this.color = DEFAULT_MISSING_FIELD_VALUE;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.model).append(COLUMNS).append(LINE)
                .append(this.engine).append("Weight: ").append(this.weight).append(LINE)
                .append("Color: ").append(this.color);

        return sb.toString();
    }
}
