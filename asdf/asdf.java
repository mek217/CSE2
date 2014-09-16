///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;

public class asdf{
    
    public static void main(String[] args){
        
        //Declare an instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //
        System.out.print("Enter a double to get the 4 digits after the decimal point: ");
        
        //Accept user input
        double number = myScanner.nextDouble();
        
        //Figure out what this shit does
        int tenths = (int)(number*10)%10;
        int hundredths = (int)(number*100)%10;
        int thousandths = (int)(number*1000)%10;
        int tenThousandths = (int)(number*10000)%10;
        
        int fourDigit = tenths*10+hundredths*100+thousandths*1000+tenThousandths*10000;
        
        //Print output
        System.out.println("tenths: "+tenths);
        System.out.println("hundredths: "+hundredths);
        System.out.println("thousandths: "+thousandths);
        System.out.println("tenThousandths: "+tenThousandths);
        
    }
}