package p03_WildFarm.animals.animal;

import java.text.DecimalFormat;

public abstract class BaseMammal extends BaseAnimal {
    private final static DecimalFormat FORMAT = new DecimalFormat("#.##");
    private String livingRegion;

    protected BaseMammal(String name, String type, Double weight,
                         Integer foodEaten, String livingRegion) {

        super(name, type, weight, foodEaten);
        this.setLivingRegion(livingRegion);
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    protected void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                this.getClass().getSimpleName(), this.getName(),
                FORMAT.format(this.getWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
