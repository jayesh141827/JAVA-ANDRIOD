public class DayorWeek {
    public static void main(String args[]) {

        int day = 1;
        String dayName;

        System.out.println("press 1 for Monday");
        System.out.println("press 2 for Tuesday");
        System.out.println("press 3 for Wednesday");
        System.out.println("press 4 for Thursday");
        System.out.println("press 5 for Friday");
        System.out.println("press 6 for Saturday");
        System.out.println("press 7 for Sunday");
        System.out.println("\n");

        switch (day) {
            case 1:
                        System.out.println("The day of the week is: " );

                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println(dayName = "Invalid day");

        }

    }
};
