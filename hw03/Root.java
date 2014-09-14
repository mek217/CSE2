////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/14/14
//Hw03
//Bycicle Program
//
//Prompt user to enter a double
//Guess, and improve guess by using given formula 5 times
//Print out a crude estimate of the cube root of the double

import java.util.Scanner;

public class Root{
    
    public static void main(String[] args){
        
        //Declare an instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user for number for taking the cube root
        System.out.print("Enter a double and I print its cube root: ");
        
        //Accept user input
        double enteredNumber = myScanner.nextDouble();
        
        //Guess first time
        double guess = enteredNumber/3;
        
        //Guess using given formula 5 times
        guess = (2*guess*guess*guess+enteredNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+enteredNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+enteredNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+enteredNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+enteredNumber)/(3*guess*guess);
        
        //Print output
        System.out.println("The cube root is "+guess+':');
        System.out.println(guess+"*"+guess+"*"+guess+"="+guess*guess*guess);
        
    }
}