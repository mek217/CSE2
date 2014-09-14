///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;

public class asdf{
    public static void main(String[] args) {
        
        //Declare an instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
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
        int milesDistance = (int)((((wheelDiameter*PI*nCounts)/12)/5280)*100);
        double totalDistance = (double)milesDistance/100;
        
        System.out.println("The distance was "+totalDistance+" miles.");
        
    }
}

