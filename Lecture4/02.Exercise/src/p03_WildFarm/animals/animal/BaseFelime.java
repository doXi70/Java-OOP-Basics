package p03_WildFarm.animals.animal;

public abstract class BaseFelime extends BaseMammal {
    protected BaseFelime(String name, String type, Double weight,
                         Integer foodEaten, String livingRegion) {

        super(name, type, weight, foodEaten, livingRegion);
    }
}
