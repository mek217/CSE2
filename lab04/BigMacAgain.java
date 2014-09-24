////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/21/14
//Lab04
//Program BigMac Again
//
//Prompt user for number of Big Macs (2.22).
//Validate input: The number of Big Macs is an integer >0.
//Print total cost of Big Macs
//Prompt user for whether they want fries ($2.15).
//Validate input: "Y", "y", "N", or "n" is entered.
//Print total cost of meal including fries

//Import scanner
import java.util.Scanner;

//Define class
public class BigMacAgain {
    
    //Define main instance
    public static void main(String[] args) {
        
        //Declare instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Declare variables
        final double BIGMAC_PRICE$ = 2.22;
        final double FRIES_PRICE$ = 2.15;
        
        //Valdate input: The number of Big Macs is an integer
        if (myScanner.hasNextInt()) {
            
            if (nBigMacs>0) {
                
                //Prompt user for number of Big Macs
                System.out.print("Enter the number of Big Macs: ");
        
                //Accept user input
                int nBigMacs = myScanner.nextInt();
                
                //Calculate price of all BigMacs
                double priceAllBigMacs$ = BIGMAC_PRICE$*nBigMacs;
                
                //Print #BigMacs, cost per BigMac, and price of all BigMacs
                System.out.println ("You ordered " +nBigMacs+ " Big Macs for a cost of " +nBigMacs+ 'x' +BIGMAC_PRICE$+ "= $" +priceAllBigMacs$+ '.');
            }
            else {
                System.out.println ("You did not enter an int > 0.");
            }
        }
        else {
            System.out.println("You did not enter an int");
            return;                         //leaves  program, i.e.
                                                // program terminates
        }
        
        //Prompt user for fries or no fries
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        
        //Accept user input
        String userInput = myScanner.next();
        
        //Valie input: entered string must equal Y, y, N, or n
        if (userInput.equals("Y") || userInput.equals("y")) {
            
            //Print that user wanted fries
            System.out.println("You ordered fries at a cost of $" +FRIES_PRICE$+ '.');
            
            //Calculate price of  meal
            double mealPrice$ = priceAllBigMacs$+FRIES_PRICE$;
            
            //Print cost of meal
            System.out.println("The total cost of the meal is $" +mealPrice$+ '.');
        }
        else if (userInput.equals("N") || userInput.equals("n")) {
            
            //Print cost of meal
            System.out.println("The total cost of the meal is $" +priceAllBigMacs$+ '.');
        }
        else {
            System.out.println("You did not enter 'Y', 'y', 'N', or 'n'");
            return;
            
        }
    }
}