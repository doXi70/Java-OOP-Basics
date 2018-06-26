package p03_CarShopExtend;

import java.io.Serializable;

public class Audi implements Rentable, Serializable {
    private String model;
    private String color;
    private Integer horsePowers;
    private String countryProduced;
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePowers, String countryProduced,
                Integer minRentDay, Double pricePerDay) {

        this.model = model;
        this.color = color;
        this.horsePowers = horsePowers;
        this.countryProduced = countryProduced;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    private String getCountryProduced() {
        return this.countryProduced;
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


    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(), this.getCountryProduced(), TIRES);
    }

}
