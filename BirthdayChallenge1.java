import java.util.Scanner;
public class BirthdayChallenge1 {
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
        //using an if/else if statment 
        if (monthInt ==  1 ){
            
            monthString = "January";
            
        } else if (monthInt == 2 ) {
            
            monthString = "February";
            
        } else if (monthInt == 3) {
            
             monthString = "March";
             
        } else if (monthInt == 4) {
            
             monthString = "April";
        }else if (monthInt == 5) {
            
             monthString = "May ";
             
        } else if (monthInt == 6) {
            
             monthString = "June";
        } else if (monthInt == 7) {
            
             monthString = "July";
             
        } else if (monthInt == 8) {
            
             monthString = "August";
             
        } else if (monthInt == 9) {
            
             monthString = "Septmeber";
             
        } else if (monthInt == 10) {
            
             monthString = "October";
             
        } else if (monthInt == 11) {
            
             monthString = "November";
             
        } else if (monthInt == 12) {
            
             monthString = "December";
        } else {
            System.out.println("You have entered an invalid month!");
        }
        
        //Display the formated date of birth 
        System.out.println("You have the following birthday: " + monthString + " " + day + ", " + year );
      //Print Thank you to the screen 
      System.out.println ("Thank You!")
    }// end of main
}//end of the class