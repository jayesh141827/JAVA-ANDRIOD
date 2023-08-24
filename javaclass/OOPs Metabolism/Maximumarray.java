 class Maximumarray {
    public static void main(String args[])
    {
        int[] arr = {10,50,400,660,28,19,60,58};
        int maximum= arr[0];
        int minimum = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]<maximum)
            {
                maximum = arr[i];
            }
            if(arr[i]> minimum)
            {
                minimum = arr[i];
            }
        }
        System.out.println("maximum value: "+maximum);
       System.out.println("minimum value: "+minimum);
     }
     
}
class array{
    private int number;

    void setarray(int number)
    {
        this.number=number;
    }
    void get()
    {
        System.out.println("maximum");
        System.out.println("minimum");
    }
    }