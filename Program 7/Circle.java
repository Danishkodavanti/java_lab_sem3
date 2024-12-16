// Circle.java
public class Circle implements Polygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area of circle: π * r^2
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Perimeter of circle: 2 * π * r
    }
}
