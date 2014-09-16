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
        System.out.print(": ");
        
        //Accept user input
        double cost = myScanner.nextDouble();
        
        //Figure out what this shit does
        int tenths = (int)(cost*10)%10;
        int hundredths = (int)(cost*100)%10;
        int thousandths = (int)(cost*1000)%10;
        int tenThousandths = (int)(cost*10000)%10;
        
        //Print output
        System.out.println("The ANSWER is "+tenths+':');
        System.out.println("The ANSWER is "+hundredths+':');
        System.out.println("The ANSWER is "+thousandths+':');
        System.out.println("The ANSWER is "+tenThousandths+':');
        
    }
}