import java.util.Scanner;

public class task5
 {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.Calculate();

    }

}

class Ract {

    Scanner s = new Scanner(System.in);
    double l;
    double w;

    public void Calculate() {

        System.out.print("enter l = ");
        l = scanner.nextDouble();
        System.out.print("enter w = ");
        w = scanner.nextDouble();

        System.out.println("area  ractangle = " + (l * w));
        System.out.println();

    }

}

class Triangle extends Ractangle {

    double b;
    double h;

    public void Calculate() {
        super.Calculate();

        System.out.print("enter b= ");
        b = scanner.nextDouble();
        System.out.print("enter h = ");
        h = scanner.nextDouble();

        System.out.println("area triangle = " + (b * h / 2));

    }

}