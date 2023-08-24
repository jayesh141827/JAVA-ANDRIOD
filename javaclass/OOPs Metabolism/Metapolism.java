 class Metapolism
{
    public static void main(String args[]) 
    {
        Book b = new Book();
        b.setBook(1, "ABC", "XYZ"); 
        b.get();      
    }   
}

class Book {

    private int book_id;
    private String title;
    private String author;


    
        void setBook(int book_id,String title,String author)
        {
            this.book_id = book_id;
            this.title = title;
            this.author = author;
        }

        void get()
        {
            System.out.println("book_id" );
            System.out.println("title");
            System.out.println("author");
        }


}