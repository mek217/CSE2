////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/29/14
//Lab05
//Program BurgerKing
//
//Prompt user to enter a choice of a burger, a soda, or fries. 
//Prompt for details of their choices

import java.util.Scanner;

public class BurgerKing{
    
    public static void main(String[] args){
        
        //Declare instance of scanner
        Scanner myScanner;
        
        //Call scanner constructer
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter a choice of a burger, a soda, or fries.
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)- ");
        
        //Declare input string
        String userInput = myScanner.next();
            
        //Validate input: input is equal to 1 char char
        if(userInput.length() > 1){
            System.out.println("single character expected");
            return;
        }
        //For burger
        if(userInput.equals("B") || userInput.equals("b")){
            //Prompt user to enter A, a, C, c, N, or n
            System.out.println("Enter A or a for \"all the fixins\"");
            System.out.println("C or c for cheese");
            System.out.print("N or n for none of the above- ");
            
            //Accept user input
            String burgerInput = myScanner.next();
            
            //Validate input: input is equal to 1 char
            if(burgerInput.length() > 1){
                System.out.println("single character expected");
                return;
            }
            
            //Use switch statement to print burger choice
            switch(burgerInput){
                case("A"):
                    System.out.println("You ordered a burger with \"all the fixins\"");
                    break;
                case("a"):
                    System.out.println("You ordered a burger with \"all the fixins\"");
                    break;
                case("C"):
                    System.out.println("You ordered a burger with cheese");
                    break;
                case("c"):
                    System.out.println("You ordered a burger with cheese");
                    break;
                case("N"):
                    System.out.println("You ordered a burger");
                    break;
                case("n"):
                    System.out.println("You ordered a burger");
                    break;
                //Input must be one of the choices
                default:
                    System.out.println("You did not enter any of A, a, C, c, N, or n");
                    break;
                }
        }
        //For soda
        else if(userInput.equals("S") || userInput.equals("s")){
            //Prompt user to enter P, p, C, c, S, s, M, or m
            System.out.println("Do you want Pepsi (P or p),");
            System.out.println("Coke (C or c),");
            System.out.println("Sprite (S or s),");
            System.out.println("or Mountain Dew (M or m)- ");
            
            //Accept user input
            String sodaInput = myScanner.next();
            
            //Validate input: input is equal to 1 char
            if(sodaInput.length() > 1){
                System.out.println("single character expected");
                return;
            }
            
            //Use switch statement to print soda choice
            switch(sodaInput){
                case("P"):
                    System.out.println("You ordered a Pepsi");
                    break;
                case("p"):
                    System.out.println("You ordered a Pepsi");
                    break;
                case("C"):
                    System.out.println("You ordered a Coke");
                    break;
                case("c"):
                    System.out.println("You ordered a Coke");
                    break;
                case("S"):
                    System.out.println("You ordered a Sprite");
                    break;
                case("s"):
                    System.out.println("You ordered a Sprite");
                    break;
                case("M"):
                    System.out.println("You ordered a Mountain Dew");
                    break;
                case("m"):
                    System.out.println("You ordered a Mountain Dew");
                    break;
                //Input must be one of the choices
                default:
                    System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
                    break;
            }
        }
        //For fries
        else if(userInput.equals("F") || userInput.equals("f")){
            //Prompt user to enter L, l, S, or s
            System.out.print("Do you want a large or small order of fries (L, l, S, or s)- ");
            
            //Accept user input
            String friesInput = myScanner.next();
            
            //Validate input: input is equal to 1 char
            if(friesInput.length() > 1){
                System.out.println("single character expected");
                return;
            }
            
            //Use switch statement to print fries choice
            switch(friesInput){
                case("L"):
                    System.out.println("You ordered large fries");
                    break;
                case("l"):
                    System.out.println("You ordered large fries");
                    break;
                case("S"):
                    System.out.println("You ordered small fries");
                    break;
                case("s"):
                    System.out.println("You ordered small fries");
                    break;
                //Input must be one of the choices
                default:
                    System.out.println("You did not enter any of L, l, S, or s");
                    break;
            }
        }
        //Input must be one of the choices
        else{
        System.out.println("You did not enter any of B, b, S, s, F, or f");
        return;
        }
    }
}