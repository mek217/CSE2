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
        
        //Prompt user for number of Big Macs
        System.out.print("Enter the number of Big Macs: ");
        
        //Valdate input: The number of Big Macs is an integer
        if (myScanner.hasNextInt()){
            
            //Accept user input
            int nBigMacs = myScanner.nextInt();
            
            if (nBigMacs > 0){
                
                //Calculate price of all BigMacs
                double priceAllBigMacs$ = BIGMAC_PRICE$*nBigMacs;
                System.out.println ("You ordered " +nBigMacs+ " Big Macs for a cost of " +nBigMacs+ 'x' +BIGMAC_PRICE$+ "= $" +priceAllBigMacs$+ '.');
                
                //Prompt user for fries or no fries
                System.out.print("Do you want an order of fries (Y/y/N/n)?");
                
                //Accept user input
                String friesQuestion = myScanner.next();
                
                
                
                
                
                
                
                if (friesQuestion.equals("Y") || friesQuestion.equals("y")){
                    
                    //Print that user wanted fries
                    System.out.println("You ordered fries at a cost of $" +FRIES_PRICE$+ ".");
                    
                    //calculate price of meal
                    double mealPrice$ = priceAllBigMacs$+FRIES_PRICE$;
                    
                    //Print cost of meal
                    System.out.println("The total cost of the meal is $" +mealPrice$+ '.');
                    
                }
                else if (friesQuestion.equals("N") || friesQuestion.equals("n")){
                    
                    //Print cost of meal
                    System.out.println("The total cost of the meal is $" +priceAllBigMacs$+ '.');
                }
                else{
                    System.out.println("You did not enter 'Y', 'y', 'N', or 'n'");
                    return;                 //leaves program, i.e.
                                                //program terminates
                }
            }
            else{
                System.out.println("You did not enter an int >0");
                return;                     //leaves program, i.e.
                                                //program terminates
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;                         //leaves program, i.e.
                                                //program terminates
        }



    }
}