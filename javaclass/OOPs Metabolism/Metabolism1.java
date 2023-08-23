class Bookk 
{
          int book_id;
          String title;
          String author;
      
          Book(){
            int book = 0;
            tital ="";
            author ="";
         }
          


       Book(int id ,string booktital, string bookauthor) {

        book_id = id;
        tital = booktital;
        author = bookauthor;
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


    

    
