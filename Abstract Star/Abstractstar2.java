import java.util.Scanner;

public class Abstractstar2 {
    public static void main(String[] args) {

        SBI bank = new SBI();
        bank.getRateOfInterest();
        bank.setter();

    }

}

abstract class Bank {
    float Amount;
    float PR;
    float Month;
    float TOtal
    Interest Rate;
    final float Interest = 7.61f;
    float K;
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
        K = scanner.nextFloat();
        PR = Amount * Interest / 100;
        Month = Amount + PR;
        Year = Month * 12;
        Total Interest Rate = PR * 12;
        K = K * Year;

    }

    public void setter() {

        System.out.println("This Month Interest Amount " + Month);
        System.out.println("This year Tnterest Amount " + Year);
        System.out.println("This year Total Tnterest " + Total Interest Rate);

        System.out.println("--------------");

        System.out.println("One year Loan Amount = " + K);

    }

}