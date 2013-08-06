import java.util.Calendar;

class Clock
{
    public static void main(String[] args)
    {
        //Get current time and date
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        
        //Display greeting
        if ( hour < 12 )
        {
            System.out.println( "Good morning.\n" );
        }
        else if ( hour < 17 )
        {
            System.out.println("Good afternoon.\n");
        }
        else
        {
            System.out.println( "Good evening" );
        }
        
        //Begin time message by showing the minutes
        System.out.print("It's");
        if (minute != 0)
        {
            System.out.print(" " + minute + " ");
            System.out.print( (minute != 1) ? "minutes" :"minute" );
            System.out.print(" past");
        }
        
        //Display the hour
        System.out.print(" ");
        System.out.print( (hour > 12) ? (hour - 12) : hour );
        System.out.print(" o'clock on ");
        
        //Display the name of the month
        switch (month)
        {
            case 1:
                System.out.print("January");
                break;     
            case 2:
                System.out.print("Febuary");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("Aprail");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break; 
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("Augest");
                break; 
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break; 
            case 11:
                System.out.print("November");
                break; 
            case 12:
                System.out.print("December");
                break;
        }
        
        //Display the year
        System.out.println( " " + day + ", " + year + ".");
        
    }
}