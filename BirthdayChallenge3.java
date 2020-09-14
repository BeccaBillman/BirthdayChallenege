import java.util.Scanner;
public class BirthdayChallenge3 {
    public static void main (String [ ] args) {
        //declare variables
        int monthInt, day, year;
        String monthString = "";
        
        //declare and create scanner object 
        Scanner userInput = new Scanner (System.in);
        
        //prompt the user for the month they were born 
        System.out.print( "Please enter the month you were born: ");
        
        //read month born 
        monthString = userInput.next();
        
        //prompt the user for the day born
        System.out.print ( "Please enter the day you were born: ");
        
        //read the day born 
        day = userInput.nextInt();

        //prompt the user for the year born 
        System.out.print( "Please enter the month you were born: "); 
        
        //read the year born 
        year = userInput.nextInt();
        
        //Process the month by associating the month (int) to month (String)
        //using an switch if statment 
        switch (monthString) {
            case "January": monthInt = 1; break; 
            case "February": monthInt = 2; break; 
            case "March": monthInt = 3; break; 
            case "April": monthInt = 4; break; 
            case "May": monthInt = 5; break; 
            case "June": monthInt = 6; break; 
            case "July": monthInt = 7; break; 
            case "August": monthInt = 8; break; 
            case "September": monthInt = 9; break; 
            case "October": monthInt = 10; break; 
            case "November": monthInt = 11; break; 
            case "December": monthInt = 12; break; 
            default: System.out.println("You have entered an invalid month!");
        }//end of switch 
        
        
        //Display the formated date of birth 
        System.out.println("You have the following birthday: " + monthString + "/ " + day + "/ " + year );
        
        //print thank you to the page 
        System.out.println ("Thank You!");

    }// end of main
}//end of the class