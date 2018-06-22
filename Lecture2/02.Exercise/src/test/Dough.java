package test;

import java.util.HashMap;
import java.util.Map;

public class Dough {
    private String doughType;
    private String doughProperty;
    private Double doughWeight;

    private static Map<String, Double> doughTypes = new HashMap<>();
    private static Map<String, Double> doughProperties = new HashMap<>();

    public static void mapOfDoughTypes() {
        doughTypes.put("White", 1.5);
        doughTypes.put("Wholegrain", 1.0);
    }

    public static void mapOfDoughProperties() {
        doughProperties.put("Crispy", 0.9);
        doughProperties.put("Chewy", 1.1);
        doughProperties.put("Homemade", 1.0);
    }

    private Map<String, Double> getDoughTypes() {
        return doughTypes;
    }

    public Dough() {
        this.doughType = "";
        this.doughProperty = "";
        this.doughWeight = -1.0;
    }

    public Dough(String doughType, String doughProperty, Double doughWeight) {
        if (!doughTypes.containsKey(doughType) || !doughProperties.containsKey(doughProperty)){
            throw  new IllegalArgumentException("Invalid type of dough.");
        }

        // DOT HERE
        if (doughWeight < 1 || doughWeight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.doughType = doughType;
        this.doughProperty = doughProperty;
        this.doughWeight = doughWeight;
    }

    public void setDoughType(String doughType) {
        if (!doughTypes.containsKey(doughType)){
            throw  new IllegalArgumentException("Invalid type of dough.");
        }

        this.doughType = doughType;
    }

    public void setDoughProperty(String doughProperty) {
        if (!doughProperties.containsKey(doughProperty)){
            throw  new IllegalArgumentException("Invalid type of dough.");
        }

        this.doughProperty = doughProperty;
    }

    public String getDoughType() {
        return doughType;
    }

    public String getDoughProperty() {
        return doughProperty;
    }

    private Double getDoughTypeModiffier(){
        return doughTypes.get(this.doughType);
    }

    private Double getDoughPropertyModiffier(){
        return doughProperties.get(this.doughProperty);
    }

    public double doughCalories(){
        return (2*this.doughWeight)*this.getDoughTypeModiffier()*this.getDoughPropertyModiffier();
    }
}