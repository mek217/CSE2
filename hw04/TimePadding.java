////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/24/14
//Hw04
//Program TimePadding
//
//Prompt user to enter a positive integer giving the number of seconds
//That have passed during the day
//Display time in conventional form

//Import Scanner
import java.util.Scanner;

//Define Class
public class TimePadding{
    
    //Define main instance
    public static void main(String[] args){
        
        //Declare instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner ( System.in );
        
        //Prompt user to enter an integer for the month
        System.out.print("Enter the time in seconds: ");
        
        //Validate input: number is an integer
        if (myScanner.hasNextInt()){
            
            //Accept user input
            int secondsInput = myScanner.nextInt();
            
            //Validate input: make sure is positive
            if (secondsInput > 0){
                
                String time = "The time is ";
                int hourPadded = (int)(secondsInput/3600);
                int secondPadded = (int)(secondsInput%60);
                int minutePadded = (int)((secondsInput-(hourPadded*3600)-(secondsInput%60))/60);
                
                System.out.printf(time + "%02d:%02d:%02d", hourPadded, minutePadded, secondPadded);
            }
            else{
                System.out.println("You did not enter a positive int");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
        }
    }
}