
abstract class Shape {
    int dimension1;
    int dimension2;

    // Abstract method to calculate and print the area
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.dimension1 = length;
        this.dimension2 = breadth;
    }

    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    Circle(int radius) {
        this.dimension1 = radius;
        this.dimension2 = 0; // Not required for a circle
    }

    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(6, 8);
        Shape circle = new Circle(7);

        // Print areas of the shapes
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        System.out.println("NAME: Danish");
        System.out.println("USN: 1BM23CS086");
    }
}