inport java.util.Scanner;
class inport1
{
public static void  main(String args[]) 
    {
        int n[]=new int[5];

        Scanner sc = new  Scanner(System.in);

        for(int i = 0 ;i <5;i++)
        { System.out.println("Enter Number at "+(i+1) +" possition");
            n[i]=sc.nextInt();
        }

        System.out.println("All date of array =>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for(int i = 0 ;i <5;i++)
        {
            System.out.println(n[i]);
        }
               
   
       

    }    
    }        