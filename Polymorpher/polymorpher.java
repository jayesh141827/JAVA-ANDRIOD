import java.util.Scanner;

public class polymorpher {
    public static void main(String[] args) {

        Triangle J = new Triangle();
        J.Calculate();

    }

}

class Ractangle {

    Scanner scanner = new Scanner(System.in);
    double l;
    double w;

    public void Calculate() {

        System.out.print("enter l = ");
        l = scanner.nextDouble();
        System.out.print("enter w = ");
        w = scanner.nextDouble();

        System.out.println("Area is Ractangle = " + (l * w));
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

        System.out.println("Area of Triangle = " + (b * h / 2));

    }

}