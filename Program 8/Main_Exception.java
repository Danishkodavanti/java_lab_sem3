import java.util.Scanner;

// Custom exception class
class WrongAge extends ArithmeticException {
    public WrongAge(String msg) {
        super(msg);
    }
}

// Father class to handle father's age and validation
class Father {
    int father_age;
    
    // Constructor to validate father's age
    public Father(int father_age) throws WrongAge {
        if (father_age <= 0) {
            throw new WrongAge("Father's age can't be negative or zero.");
        } else if (father_age < 18) {
            throw new WrongAge("Father's age is valid, but he can't be a father at such a young age.");
        }
        this.father_age = father_age;
        System.out.println("Father's age is set: " + father_age);
    }
}

// Son class that inherits from Father class and checks son's age
class Son extends Father {
    int son_age;
    
    // Constructor to validate son's age and age gap with father
    public Son(int son_age, int father_age) throws WrongAge {
        super(father_age);
        
        if (son_age <= 0) {
            throw new WrongAge("Son's age can't be negative or zero.");
        } else if (father_age - son_age < 18) {
            throw new WrongAge("The age gap between father and son should be greater than 18 years.");
        }
        
        this.son_age = son_age;
        System.out.println("Son's age is set: " + son_age);
    }
}

public class Main_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input for father's age
        System.out.println("Enter the age of father:");
        int fage = scan.nextInt();
        
        // Input for son's age
        System.out.println("Enter the age of son:");
        int sage = scan.nextInt();
        
        try {
            // Create Son object which invokes Father constructor
            Son son = new Son(sage, fage);
        } catch (WrongAge e) {
            // Catch the exception and print the message
            System.out.println("Exception caught -> " + e.getMessage());
        }
        
        System.out.println("Name: Danish\nUSN:1BM23CS086");
    }
}
