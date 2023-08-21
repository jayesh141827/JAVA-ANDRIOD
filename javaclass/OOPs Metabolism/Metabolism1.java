 class Metabolism1
 {
    public static void main(String[] args)
    {
        Book defaultBook = new Book();
        defaultBook.setBookId(1);
        defaultBook.setTitle("Default Book");
        defaultBook.setAuthor("Default Author");
        Book paramBook = new Book(2, "Parameterized Book", "Parameterized Author");

        System.out.println("Default Book: " + defaultBook.getTitle()+ " by " + defaultBook.getAuthor());
        System.out.println("Parameterized Book: " + paramBook.getTitle() + " by " + paramBook.getAuthor());
    }

}