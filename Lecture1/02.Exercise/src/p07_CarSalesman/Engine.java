package p07_CarSalesman;

public class Engine {
    // if field has null value, it must have this value applied;
    private static final String DEFAULT_MISSING_FIELD_VALUE = "n/a";
    private static final String LINE = System.lineSeparator();
    private static final String COLUMNS = ":";

    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = DEFAULT_MISSING_FIELD_VALUE;
        this.efficiency = DEFAULT_MISSING_FIELD_VALUE;
    }

    public String getModel() {
        return this.model;
    }

    public String getPower() {
        return this.power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(this.model).append(":").append(LINE)
                .append("Power: ").append(this.power).append(LINE)
                .append("Displacement: ").append(this.displacement).append(LINE)
                .append("Efficiency: ").append(this.efficiency).append(LINE);

        return result.toString();
    }
}
