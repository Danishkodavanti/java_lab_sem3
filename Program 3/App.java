import java.util.Scanner;

// Class to represent a Book
class Book {
    // Member variables
    private String name;
    private String author;
    private int price;
    private int num_pages;

    // Constructor to initialize the book details
    public Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getNumPages() {
        return num_pages;
    }

    // toString method to display book details
    //@Override
    public String toString() {
        return "Book Name: " + name + "\nAuthor: " + author + "\nPrice: " + price + "\nNumber of Pages: " + num_pages;
    }
}

public class App {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Asking the user for the number of books
        System.out.print("Enter the number of books: ");
        int n = scan.nextInt();
        scan.nextLine();  // consume newline

        // Array to store Book objects
        Book[] books = new Book[n];

        // Loop to accept details of each book
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of book " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scan.nextLine();

            System.out.print("Enter author: ");
            String author = scan.nextLine();

            System.out.print("Enter price: ");
            int price = scan.nextInt();

            System.out.print("Enter number of pages: ");
            int num_pages = scan.nextInt();
            scan.nextLine();  // consume newline

            // Creating a new Book object and storing it in the array
            books[i] = new Book(name, author, price, num_pages);
        }

        // Displaying all the books
        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println(book.toString());
            System.out.println("--------------------");
        }

        // Closing the scanner to prevent resource leak
        scan.close();
        System.out.println("Name: Danish\n USN:1BM23CS086");
    }
}
