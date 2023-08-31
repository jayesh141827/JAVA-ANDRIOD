public class LargerNumberFinder{
    
    public static void main(String args[]){
        
       Double a = 20.5;
       Double b = 15.3;

        if (a > b){
            System.out.println("larger number is: " + a);
            
        } else if (b > a){
            System.out.println("larger number is: " + b);
            
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}