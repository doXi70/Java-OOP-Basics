package p06_RawData;

public class Car {
    private Model model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;

    public Car(Model model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getCargoType() {
        return this.cargo.getType();
    }

    public boolean isTirePressureBelowOne() {
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }

        return false;
    }

    public boolean isEnginePowerAbove250() {
        return this.engine.getPower() > 250;
    }

    @Override
    public String toString() {
        return String.format("%s", this.model.getName());
    }
}
