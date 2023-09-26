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
    float Tatal;
    float total_I ;
    final float Interest = 7.61f;
    float K;
    float Year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateOfInterest();

    abstract public void setter();77&

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
        total_I  = PR * 12;
        K = K * Year;

    }

    public void setter() {

        System.out.println("This Month Interest Amount " + Month);
        System.out.println("This year Tnterest Amount " + Year);
        System.out.println("This year Total Tnterest " +  Interest );

        System.out.println("--------------");

        System.out.println("One year Loan Amount = " + K);

    }

}
