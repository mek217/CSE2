////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/12/14
//Lab03
//Program BigMac
//
//Write a program that computes the 
//cost of buying some Big Macs.
//Use the Scanner class to obtain Big Mac 
//quantity, cost, and percent tax (6% PA, 8% MA).

//Import scanner
import java.util.Scanner;

//Define class
public class BigMac{
    
    //Define main method
    public static void main(String[] args) {
        
        //Declare an instance of the Scanner object.
        Scanner myScanner;
        
        //Call the scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user for the number of tickets
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        
        //Accept user input
        int nBigMacs = myScanner.nextInt();
        
        //Prompt the user for the cost per Big Mac
        //And percent sales tax. Accept input
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx):");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;   //user enters percent, so change to proportion
        
        //Calculations
        double cost$;
        int dollars,            //whole dollar amount of cost
            dimes, pennies;     //for decimal point management for cost
        //Dat BigMac doe
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //Get integer amount, drop decimal fraction
        dollars = (int)cost$;
        //Get tenths place amount
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        
        //Print output
        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
        
        
    }   //end of main method
}   //end of class