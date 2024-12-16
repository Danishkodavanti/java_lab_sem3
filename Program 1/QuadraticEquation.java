import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        
        // Check if discriminant is positive, negative, or zero
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root (both roots are the same)
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and distinct.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        
        System.out.println("Name: Danish k \n USN: 1BM23CS086");
        scanner.close();
    }
}
