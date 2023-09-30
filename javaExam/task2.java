import java.util.Scanner;

public class task2 {

    public static void main(String arg[]) {

        int code;

        Scanner s = new Scanner(System.in);
        
        System.out.println("enter  number = ");
        code = s.nextInt();

        int name = code;

        if (name > 0) {
            System.out.println(name + "enetr numebr  possitive");
        }
        if (name == 0) {
            System.out.println(name + "enetr numebr zero");
        } else {
            System.out.println(name + "enetr numebr  nagative");
        }
    }
}