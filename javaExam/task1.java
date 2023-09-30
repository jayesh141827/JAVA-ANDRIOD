public class Constructor {
    public static void main(String[] args) {
        book ic = new book(id, tital);
        book inc = new book();

    }
}

class book {
    book() {
        System.out.println("Default Constructor");
    }

    tital(String id, String name) {
        System.out.println("id = " + id + "name = " + name);
    }

}