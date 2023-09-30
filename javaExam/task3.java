public class task3 {
    
    public static void main(String[] args) {

        System.out.println("all batsman name");
        System.out.println();
        Batsman B = new Batsman();
        B.get();

        System.out.println("all bowler name ");
        System.out.println();
        Bowler bo = new Bowler();
        bowler.show();
    }
}

class cricketer {
    String a = "virat ";
    String b = "rohit";
    String c = "jadeja";
    String d = "hardik";
    String e = "rahul";
    String f = "mohmed";
    String g = "aswin";
    String h = "dhoni";
    String i = "sachid";
    String j = "shikhar";
    String k = "none";
}

class Batsman extends cricketer {

    void get() {

        System.out.println("batsman name = " + a);
        System.out.println("batsman name = " + b);
        System.out.println("batsman  name = " + c);
        System.out.println("batsman name  = " + d);
        System.out.println("batsman name = " + e);
        System.out.println("batsman name = " + f);
    }
}

class Bowler extends cricketer {

    void show() {

        System.out.println("bowler name = " + g);
        System.out.println("bowler name = " + h);
        System.out.println("bowler name = " + i);
        System.out.println("bowler name = " + j);
        System.out.println("bowler name = " + i);
        System.out.println("bowler name = " + k);
    }
}

}