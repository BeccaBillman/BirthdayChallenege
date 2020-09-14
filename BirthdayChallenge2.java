import java.util.Scanner;
public class BirthdayChallenge2 {
    public static void main (String [ ] args) {
         //declare variables
        int monthInt, day, year;
        String monthString = "";
        
        //declare and create scanner object 
        Scanner userInput = new Scanner (System.in);
        
        //prompt the user for the day they were born as an interger 
        System.out.print( "Please enter the month you were born in as an interger: ");
        
        //read month born 
        monthInt = userInput.nextInt();
        
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
        switch (monthInt){
            case 1: 
                monthString = "January";
            break; 
            case 2: 
                monthString = "February";
            break;
            case 3: 
                monthString = "March";
            break;
            case 4: 
                monthString = "April";
            break;
            case 5: 
                monthString = "May";
            break;
            case 6: 
                monthString = "June";
            break;
            case 7: 
                monthString = "July";
            break;
            case 8: 
                monthString = "August";
            break;
            case 9: 
                monthString = "Septmeber";
            break;
            case 10: 
                monthString = "October";
            break;
            case 11: 
                monthString = "November";
            break;
            case 12: 
                monthString = "December";
            break;
            default:
            System.out.println("You have entered an invalid month!");
        }//end of switch 
        
        
        //Display the formated date of birth 
        System.out.println("You have the following birthday: " + monthString + " " + day + ", " + year );
      //Print thank you to the page 
      System.out.println ("Thank You!")
        
      
    }// end of main
}//end of the class