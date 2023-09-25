import java.util.Scanner;

public class Abstract1{

    public static void main(String[] args) {

        Rectangle a = new Rectangle();
        a.read();
        a.show();

        Circle b = new Circle();
        b.read();
        b.show();
    }

}

abstract class Shape {

    final float pi = 3.14f;
    int l, w, area;
    float r, Total;
    Scanner scanner = new Scanner(System.in);

    abstract void read();

    abstract void show();

}

class Rectangle extends Shape {

    void read() {
        System.out.print("Enter of Lenght = ");
        l = scanner.nextInt();
        System.out.print("Enter of Width = ");
        w = scanner.nextInt();
        area = l * w;

    }

    void show() {

        System.out.println("Rectangle Area = " + area);

    }

}

class Circle extends Shape {

    void read() {

        System.out.print("Enter  Circle Radius = ");
        r = scanner.nextFloat();
        Total = pi * r * r;

    }

    void show() {

        System.out.println(" Enter Circle of Area = " + Total);

    }

}
