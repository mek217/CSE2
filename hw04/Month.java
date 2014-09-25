////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/24/14
//Lab04
//Program Month
//
//Prompt user to enter an integer for the month (1 for Jan, 2 for Feb, etc.)
//Print number of days in the month
//If 2 is entered, prompt the year to calculate if leap year or not.

//Import Scanner
import java.util.Scanner;

//Define class
public class Month{
    
    //Define main instance
    public static void main(String[] args){
        
        //Declare instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner ( System.in );
        
        //Prompt user to enter an integer for the month
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        
        //Validate input: number is an integer
        if (myScanner.hasNextInt()){
            
            //Accept user input
            int monthInput = myScanner.nextInt();
            
            //Validate input: make sure input is an integer between 1 and 12
            if (monthInput >= 1 & monthInput <= 12 ){
                
                //Print 31 days for odd ints between 1 and 12
                if (monthInput%2 == 1){
                    System.out.println("The month has 31 days");
                }
                //Print 30 days for even ints between 1 and 12, except 2
                else if (monthInput%2 == 0 & monthInput >= 4){
                    System.out.println("The month has 30 days");
                }
                //If input is 2, prompt user to enter year
                else if (monthInput == 2){
                    System.out.print("Enter an int giving the year");
                    
                    //Validate input: number is an integer
                    if (myScanner.hasNextInt()){
                        
                        //Accept user input
                        int yearInput = myScanner.nextInt();
                        
                        //Validate input: make sure integer is positive
                        if (yearInput > 0){
                            
                            //Is a leap year if divisible by 4, but not divisible by 100 or 400
                            if (yearInput%4 == 0 & yearInput%100 != 0 & yearInput%400 != 0){
                                System.out.println("The month has 29 days");
                            }
                            //Is not a leap year if divisible by 100 but ont divisible by 400
                            else if (yearInput%4 == 0 & yearInput%100 == 0 & yearInput%400 != 0){
                                System.out.println("The month has 28 days");
                            }
                            //Is a leap year if divisible by 4, 100, and 400
                            else if (yearInput%4 == 0 & yearInput%100 == 0 & yearInput%400 == 0){
                                System.out.println("The month has 29 days");
                            }
                            //Is not a leap year if not divisible by 4, 100, or 400
                            else{
                                System.out.println("The month has 28 days");
                            }
                        }
                        else{
                            System.out.println("You did not enter a positive int");
                            return;
                        }
                    }
                    else{
                        System.out.println("You did not enter an int");
                        return;
                    }
                }
            }
            else{
                System.out.println("You did not enter an int between 1 and 12");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
    }
}
