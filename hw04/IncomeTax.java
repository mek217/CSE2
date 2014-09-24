////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/21/14
//Lab04
//Program IncomeTax
//
//Prompt user to enter an int that gives the thousands of dollars of income 
//Write out the amount of tax on that income, given the progressive schedule:
//<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

//Import scanner
import java.util.Scanner;

//Define class
public class IncomeTax {
    
    //Define main instance
    public static void main(String[] args) {
        
        //Declare instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Declare constants
        final double LESS_TWENTY = 0.05;
        final double TWENTY_FORTY = 0.07;
        final double FORTY_SEVENTYEIGHT = 0.12;
        final double GREATER_SEVENTYEIGHT = 0.14;
        
        //Declare cleaner percent variables
        double lessTwenty = (double)((int)(LESS_TWENTY*100));
        double twentyForty = (double)((int)(TWENTY_FORTY*100));
        double fortySeventyEight = (double)((int)(FORTY_SEVENTYEIGHT*100));
        double greaterSeventyEight = (double)((int)(GREATER_SEVENTYEIGHT*100));
        
        //Prompt user for an int that gives the thousands of dollars of income
        System.out.print("Enter an int giving the number of thousands- ");
        
        //First validate input: number is an integer
        if (myScanner.hasNextInt()){
            
            //Accept user input
            int thousandsDollars = myScanner.nextInt();
            
            //Second validate input: number is >0
            if (thousandsDollars > 0){
                
                //Intermediate value
                int dollars = thousandsDollars*1000;
                
                //Test for output >=78
                if (thousandsDollars >= 78){
                    
                    //Print output
                    System.out.println("The tax rate on $" +thousandsDollars+ ",000 is " +greaterSeventyEight+ "%, and the tax is $" +(thousandsDollars*GREATER_SEVENTYEIGHT)*1000+ ".");
                }
                else if (thousandsDollars >= 40 && thousandsDollars < 78){
                    
                    //Print output
                    System.out.println("The tax rate on $" +thousandsDollars+ ",000 is " +fortySeventyEight+ "%, and the tax is $" +(thousandsDollars*FORTY_SEVENTYEIGHT)*1000+ ".");
                }
                else if (thousandsDollars >= 20 && thousandsDollars < 40){
                    
                    //Print output
                    System.out.println("The tax rate on $" +thousandsDollars+ ",000 is " +twentyForty+ "%, and the tax is $" +(thousandsDollars*TWENTY_FORTY)*1000+ ".");
                }
                else if (thousandsDollars < 40){
                    
                    //Print output
                    System.out.println("The tax rate on $" +thousandsDollars+ ",000 is " +lessTwenty+ "%, and the tax is $" +(thousandsDollars*LESS_TWENTY)*1000+ ".");
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
