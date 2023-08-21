 
 class Metabolism1
 {
    
    private int book_id;
    private String title;
    private String author;

   
    public Book() 
    {
        book_id = 0;
        title = "";
        author = "";
    }

  
     Book(int book_id, String title, String author) 
    {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
    }

    
     int getBookId() 
    {
        return book_id;
    }

    String getTitle() 
    {
        return title;
    }

     String getAuthor() 
    {
        return author;
    }

    public static void main(String args[]) 
    {
        
        Book defaultBook = new Book();
        Book parameterizedBook= new Book(420, "ONE DAY INJOY OF LIFE", "jayesh parmar");

        
        System.out.println("Default Book:");
        System.out.println("Book ID: " + defaultBook.getBookId());
        System.out.println("Title: " + defaultBook.getTitle());
        System.out.println("Author: " + defaultBook.getAuthor());

        System.out.println("\nParameterized Book:");
        System.out.println("Book ID: " + parameterizedBook.getBookId());
        System.out.println("Title: " + parameterizedBook.getTitle());
        System.out.println("Author: " + parameterizedBook.getAuthor());
    }
}
