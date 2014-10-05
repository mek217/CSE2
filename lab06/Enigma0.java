/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
    public static void main(String[] args){
        
        System.out.print("Enter an int- ");
        
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        
        if (scan.hasNextInt()){
            n = scan.nextInt();
            System.out.println("You entered " + n);
        }
        else{
            
            n = 4;
            
            System.out.println("You entered " + n);
        }
        
        int k=4,p=6,q=7,r=8;
        
        switch(k+p+q+r){
            
            case 24: 
                
            case 25: System.out.println("sum is 25");
            
            default: System.out.println("Again, you entered " + n);
        }
    }
}

/*  Error report: 
 *      Line 12: the brackets next to args sould have been next to String
 *      Line 21: int n should have been initialized (done on line 18)
 *      Line 26: n was already initialized
 *      Line 31: n was already initialized
 *      Line 39: Should have printed "Again", not "To repeat"
 */

