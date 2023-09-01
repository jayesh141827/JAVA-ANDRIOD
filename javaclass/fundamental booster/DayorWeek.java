public class DayorWeek{
    public static void main(String args[]){
        
        int day = 10; 
        String dayName;
    
    System.out.println("press 1 for Monday");
    System.out.println("press 2 for Tuesday");
    System.out.println("press 3 for Wednesday");
    System.out.println("press 4 for Thursday");
    System.out.println("press 5 for Friday");
    System.out.println("press 6 for Saturday");
    System.out.println("press 7 for Sunday");
    System.out.println("\n");
        
        switch (day){
            case 1:
                System.out.println(dayName ="Monday");
                
            case 2:
                System.out.println(dayName = "Tuesday");
            
            case 3:
                System.out.println(dayName = "Wednesday");
                
            case 4:
                System.out.println(dayName = "Thursday");
                
            case 5:
                System.out.println(dayName = "Friday");
                
            case 6:
                System.out.println(dayName = "Saturday");
                
            case 7:
                System.out.println(dayName = "Sunday");
                
            default:
                System.out.println(dayName = "Invalid day");
                
        }

        System.out.println("The day of the week is: " + dayName);
    }
};
