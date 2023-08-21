 public class Book {
    // Data members
    private int book_id;
    private String title;
    private String author;

    // Default constructor
    public Book() {
        book_id = 0;
        title = "Unknown";
        author = "Unknown";
    }

    // Parameterized constructor
    public Book(int book_id, String title, String author) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects using both constructors
        Book defaultBook = new Book();
        Book parameterizedBook = new Book(1, "Java Programming", "John Doe");

        // Displaying book details
        System.out.println("Default Book Details:");
        System.out.println("Book ID: " + defaultBook.book_id);
        System.out.println("Title: " + defaultBook.title);
        System.out.println("Author: " + defaultBook.author);

        System.out.println("\nParameterized Book Details:");
        System.out.println("Book ID: " + parameterizedBook.book_id);
        System.out.println("Title: " + parameterizedBook.title);
        System.out.println("Author: " + parameterizedBook.author);
    }
}
