// Rectangle.java
public class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width; // Area of rectangle: length * width
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width); // Perimeter of rectangle: 2 * (length + width)
    }
}
