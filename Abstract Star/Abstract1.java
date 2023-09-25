import java.util.Scanner;

public class Abstract1 {
    public static void main(String[] args) {
        Rectangele abc = new Rectangele(){
            abc.read();
            abc.show();
            cicle cicle = new cicle();
            c.read();
            c.show();
        
    }
}

    abstract class shap {

        final float pi = 3.14f;
        int l, b, area;
        Scanner scan = new Scanner(System.in);

        abstract void read();

        abstract void show();
    }

    class Rectangele extends shap {

        void read() {
            System.out.print("Enter l =");
            l = scan.nextInt();
            System.out.print("Enter b =");
            b = scan.nextInt();

            area = l * b;
        }

        void show() {
            System.out.print("area = " + area);
        }
    }

class cicle extends shap{
    float r,total;
    void read(){
        System.out.print("Enter r = ");
        r = scan.nextFloat();
        total = pi * r * r;

}
 void show(){
    System.out.println("area = "+ total);
  }
}