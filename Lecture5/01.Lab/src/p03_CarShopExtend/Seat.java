package p03_CarShopExtend;

import java.io.Serializable;

public class Seat implements Sellable, Serializable {
    private String model;
    private String color;
    private Integer horsePowers;
    private String countryProduced;
    private Double sellPrice;

    public Seat(String model, String color, Integer horsePowers, String countryProduced, Double sellPrice) {
        this.model = model;
        this.color = color;
        this.horsePowers = horsePowers;
        this.countryProduced = countryProduced;
        this.sellPrice = sellPrice;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePowers;
    }

    public String getCountryProduced() {
        return this.countryProduced;
    }

    @Override
    public Double getPrice() {
        return this.sellPrice;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(), this.getCountryProduced(), TIRES);
    }

}
