/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        double percent;
        
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        
        double x = myScanner.nextDouble();
        
        System.out.println("You entered "+x+"%");
        
        //print out the proportion remaining for all possible percentages
        if( x>0 && x<99 ){
            percent = x/100;
            System.out.println("The proportion remaining is " + percent);
        }
        else{
            System.out.println("Entered number is not between 0 and 99");
            
        }
    }
}

/* Error report: 
 *  21: scanner cannot be called without being declared or constructed first
 *  13: Declare instance of scanner
 *  15: Call scanner constructor
 *  26: Make it so that all input between 0 and 99 work
 *  26: If statement requires a statement in brackets
 *  30: Validate input is between 0 and 99
 */