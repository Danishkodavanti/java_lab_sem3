import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;
    private int numSubjects;

    // Method to accept student details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        numSubjects = scanner.nextInt();

        credits = new int[numSubjects];
        marks = new int[numSubjects];

        System.out.println("Enter credits for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Credits for Subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
        }

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        int totalCredits = 0;
        int weightedGradePoints = 0;

        for (int i = 0; i < numSubjects; i++) {
            int gradePoint = calculateGradePoint(marks[i]);
            weightedGradePoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return (double) weightedGradePoints / totalCredits;
    }

    // Method to calculate grade point based on marks
    private int calculateGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0; // Fail
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + calculateSGPA());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
    }
}
