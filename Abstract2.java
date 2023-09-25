import java.util.Scanner;

public class Abstract2 {
    public static void main(String[] args) {

        BoB bob = new BoB();
        bob.getRateOfInterest();
        bob.setter();

    }

}

abstract class Bank {
    float Amount;
    float Pr;
    float Month;
    float TOtal interest rate;
    final float interest = 7.61f;
    float R;
    float Year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateOfInterest();

    abstract public void setter();

}

class SBI extends Bank {

    public void getRateOfInterest() {

        System.out.print("Enter of Month EMI = ");
        Amount = scanner.nextInt();
        System.out.print("Interest of yearly EMI = ");
        v = scanner.nextFloat();
        Pr = Amount * Interest / 100;
        month = amount + pr;
        year = month * 12;
        total_interest_rate = pr * 12;
        v = v * year;

    }

    public void setter() {

        System.out.println("Hole Month Interest Amount " + month);
        System.out.println("Hole year Tnterest Amount " + year);
        System.out.println("HOle year Total Tnterest " + total_interest_rate);

        System.out.println("<-><-<-><-><-><-><-><-><-><-><-><-><-><-><->");

        System.out.println("Full year Loan Amount = " + v);

    }

		}
