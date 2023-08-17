 class patern
  {
    public static void main(String args[])
    {
        int r, c, k;
        for (r = 1; r <= 5; r++) 
        {
            for (k = r; k <= 4; k++)
            {
                System.out.print(" ");
            }
            for (c = 1; c <= r; c++)
            {
                System.out.print("1", c);
            }
            System.out.println(); 
        }
    }
}