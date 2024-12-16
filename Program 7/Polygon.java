// Polygon.java
public interface Polygon {
    default double getPerimeter() {
        return 0.0;
    }

    double getArea();
}
