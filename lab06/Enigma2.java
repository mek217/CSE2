import java.util.Scanner;

public class Enigma2{
    
    public static void main(String [] arg){
        
        int n=40,k=60;
        
        String out="";
        
        switch(n){
            case 12: 
            case 13: out+=13;
            case 40: out+=40/0;
        }
        System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * Error: 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *         at Enigma2.main(Enigma2.java:14)
 * 
 * Interpretation:
 * There exists a runtime error on line 14 of the code shown above.
 * The exception says you cannot divide by zero, which is what happens at line 14. 
 * 
 */

