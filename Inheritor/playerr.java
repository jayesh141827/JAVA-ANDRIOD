public class playerr {
    
        public static void main(String[] args) {
    
            System.out.println("----------ALL BATSMAN NAME----");
            System.out.println();
            Batsman Bet = new Batsman();
            Bet.get();
    
            System.out.println("-----ALL BOWLER NAME -----");
            System.out.println();
            Bowler bowler = new Bowler();
            bowler.show();
        }
    }
    
    class cricketer {
        String a = "VIRAT KOHLI";
        String b = "ROHIT SHRMA";
        String c = "JADEJA";
        String d = "HARDIK PANDIYA";
        String e = "KL RAHUL";
        String g = "MOHAMMED SIRAJ";
        String h = "RAVICHANDRAN ASHWIN";
        String i = "MS DHONI";
        String j = "SACHIN TANDULKAR";
        String k = "SHIKHAR DHAWAN";
    
    }
    
    class Batsman extends cricketer {
    
        void get() {
    
            System.out.println("Batsman = " + b);
            System.out.println("Batsman = " + a);
            System.out.println("Batsman = " + c);
            System.out.println("Batsman = " + d);
            System.out.println("Batsman = " + e);
            System.out.println("Batsman = " + j);
        }
    }
    
    class Bowler extends cricketer {
    
        void show() {
    
            System.out.println("BOWLER NAME = " + k);
            System.out.println("BOWLER NAME = " + g);
            System.out.println("BOWLER NAME = " + k);
            System.out.println("BOWLER NAME = " + h);
            System.out.println("BOWLER NAME = " + i);
        }
    }
    
}
