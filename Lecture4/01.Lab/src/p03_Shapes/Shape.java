package p03_Shapes;

public abstract class Shape {
    private double area;
    private double perimeter;

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public double getArea() {
        return this.area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
