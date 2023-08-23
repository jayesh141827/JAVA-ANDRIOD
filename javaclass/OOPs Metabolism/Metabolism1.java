
class Book 
{
     // Main method to test the Book class
    static void main(String args[]) 
    {
    // Data members
          int book_id;
          String title;
          String author;

    // Constructor
    Book(int book_id, String title, String author) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
    }
      // Creating an instance of Book
        Book book1 = new Book(420, "one day ", "F. Scott Fitzgerald");

        // Displaying book information
        book1.displayInfo();

        // Method to display book information
    void displayInfo() 
    {
        System.out.println("Book ID: " + book_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    }
}


       public static void main(String[] args) {
        // Creating objects using constructors
        Book defaultBook = new Book();  // Default constructor
        Book paramBook = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");  // Parameterized constructor
        
        // Displaying information
        System.out.println("Default Book - ID: " + defaultBook.book_id + ", Title: " + defaultBook.title + ", Author: " + defaultBook.author);
        System.out.println("Parameterized Book - ID: " + paramBook.book_id + ", Title: " + paramBook.title + ", Author: " + paramBook.author);
    }
}  
