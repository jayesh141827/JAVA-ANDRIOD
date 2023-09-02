public class Multiplication {
    public static void main(String args[]) {
        int a = 1;
        
        while (a <= 10) 
        {
            System.out.println("Multiplication table for " + a + ":");
            
           int i = 1;
            while (i <= 10) 
            {
              int result = a * i;
                System.out.println(a + " x " + i + " = " + result);
                i++;
            }
            
            System.out.println(); 
            a++;
        }
    }
};
