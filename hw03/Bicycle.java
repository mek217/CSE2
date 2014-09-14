////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/14/14
//Hw03
//Bycicle Program
//
//Prompt user to enter 2 digits:
//#1 counts on a cyclometer
//#2 seconds during which counts occurred
//Print distance travelled and avg. miles per hour.
//Assume diameter of wheels are 27 inches

import java.util.Scanner;

public class Bicycle{
    
    public static void main(String[] args){
        
        //Declare an instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user for seconds during which counts occurred
        System.out.print("Enter number of seconds: ");
        
        //Accept user input
        double seconds = myScanner.nextDouble();
        
        //Prompt user for counts on cyclometer
        System.out.print("Enter number of counts: ");
        
        //Accept user input
        double nCounts = myScanner.nextDouble();
        
        //Calculations
        double wheelDiameter = 27.0,
        PI = 3.14159,
        inchesPerFoot = 12,
        feetPerMile = 5280,
        secondsPerMinute = 60,
        minutesPerHour = 60;
        
        //Convert from counts to miles to 2 decimal places
        int intermediateDistance = (int)((((wheelDiameter*PI*nCounts)/12)/5280)*100);
        double totalDistance = (double)intermediateDistance/100;
        
        //Get mph to 2 decimal places
        int intermediateMilesPerHour = (int)(totalDistance/(seconds/secondsPerMinute/minutesPerHour)*100);
        double totalMilesPerHour = (double)intermediateMilesPerHour/100;
        
        //Print distance travelled and avg. mph
        System.out.println("The distance was "+totalDistance+" miles and took "+seconds/secondsPerMinute+" minutes.");
        System.out.println("The average mph was "+totalMilesPerHour+" miles per hour.");
        
    }
}