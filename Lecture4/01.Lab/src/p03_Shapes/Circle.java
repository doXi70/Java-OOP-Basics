package p03_Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public final double getRadius() {
        return this.radius;
    }

    @Override
    public void calculateArea() {
        super.setArea(this.getRadius() * this.getRadius() * Math.PI);
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.getRadius());
    }
}
