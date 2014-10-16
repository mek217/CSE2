////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/14/14
//Hw06
//Program Root

import java.util.Scanner;

public class Root{
    
    public static void main(String[] args){
        
        Scanner myScan;
        
        myScan = new Scanner(System.in);
        
        String lastCheck;
        
        //Wrap the code in an infinite loop. Give user the option to break out after each run of the program.
        while(true){
                
            //Force user to enter a double greater than 0
            System.out.print("Enter a double greater than 0- ");
            
            if(myScan.hasNextDouble()){
                
                double x = myScan.nextDouble();
                
                if(x > 0){
                    
                    //Declare variables low, middle, and high
                    double low = 0.0, high = x + 1;
                    
                    double mid = (low+high)/2;
                    
                    //LOOP ALL OF THIS:
                    while(high-low > 0.0000001){
                        
                        //If middle squared is greater than x, then set high to middle.
                        if(mid*mid > x){
                            
                            high = mid;
                        }
                        
                        //If middle squared is less than x, then set low to middle.
                        else if(mid*mid < x){
                            
                            low = mid;
                        }
                        
                        //Reset mid to match the new high and low
                        mid = (low+high)/2;
                    }
                    
                    //Print calculated output
                    System.out.println("The square root of your number is " + mid + ", with a tolerance level of 0.0000001.");
                }
                else{
                    System.out.println("User did not enter a double greater than 0");
                }
            }
            else{
                System.out.println("User did not enter a double. ");
            }
            
            //Give user the option to break out of the infinite loop after each run of the program
            System.out.print("Enter y or Y to go again- ");
            lastCheck = myScan.next();
            if(lastCheck.equals("Y") || lastCheck.equals("y")){
            }
            else{
                break;
            }
        }
    }
}