////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/26/14
//Hw08
//Program HW8
//
//Call on three different overloaded versions of getInput():
//
//(scan,"Cc"): Enter 'C' or 'c' to continue, anything else to quit- 
//"You entered '"+input+"'"
//
//(scan,"yYnN",5): Enter 'y', 'Y', 'n', or 'N'- 
//  if(input!=' '){
//  System.out.println("You entered '"+input+"'");
//  }
//
//input=getInput(scan,"Choose a digit.","0123456789");
//  System.out.println("You entered '"+input+"'");

//Recall methods .next() & .length()
//New: .charAt(n): returns nth character

import java.util.Scanner;
public class HW8{
    public static void main(String[] arg){
        char input;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input=getInput(scan,"Cc");                                                  //Overload type 1
        System.out.println("You entered '"+input+"'");
        
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input=getInput(scan,"yYnN",5); //give up after 5 attempts                   //Overload type 2
        if(input!=' '){
            System.out.println("You entered '"+input+"'");
        }
        
        input=getInput(scan,"Choose a digit.","0123456789");                        //Overload type 3
        System.out.println("You entered '"+input+"'");
        
    }

    public static char getInput(Scanner scan, String cont){                         //Overload method type 1
        char userChar;
        int tries = 0;
        while(true){
            cont = scan.next();
            if(cont.length() != 1){
                System.out.print("You should enter exactly one character- ");
                continue;
            }
            else{
                if(cont.equals("c") || cont.equals("C")){
                    return userChar = cont.charAt(0);
                }
                else{
                    System.out.println("cont: " + cont);
                    System.out.print("You did not enter a character from the list 'Cc'; try again- ");
                    continue;
                }
            }
        }
    }
    
    public static char getInput(Scanner scan, String cont, int tries){              //Overload method type 2
        char userChar;
        while(tries > 0){
            --tries;
            cont = scan.next();
            if(cont.length() != 1){
                System.out.print("You should enter exactly one character- ");
                continue;
            }
            else{
                if(cont.equals("y") || cont.equals("Y") || cont.equals("n") || cont.equals("N")){
                    return userChar = cont.charAt(0);
                }
                else{
                    System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
                    continue;
                }
            }
        }
        System.out.println();
        System.out.println("You failed after 5 tries");
        return userChar = ' ';
    }
    
    public static char getInput(Scanner scan, String cont, String number){           //Overload method type 3
        char userChar;
        while(true){
            System.out.println("Choose a digit.");
            System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
            cont = scan.next();
            if(cont.length() != 1){
                System.out.println("Enter exactly one character");
                continue;
            }
            else{
                for(int check = 0; check <= 9; check++){                            //Check that input cont is one of the digits in String number
                    if (cont.charAt(0) == number.charAt(check)){
                    return userChar = cont.charAt(0);
                    }
                }
                System.out.println("You did not enter an acceptable character");
                continue;
            }
        }
    }
}



//SAMPLE RUNS:
//Enter 'C' or 'c' to continue, anything else to quit- 7
//You did not enter a character from the list 'Cc'; try again- ths
//You should enter exactly one character- c
//You entered 'c'
//Enter 'y', 'Y', 'n', or 'N'- r
//You did not enter a character from the list 'yYnN'; try again- r
//You did not enter a character from the list 'yYnN'; try again- r
//You did not enter a character from the list 'yYnN'; try again- r
//You did not enter a character from the list 'yYnN'; try again- r
//You did not enter a character from the list 'yYnN'; try again-
//You failed after 5 tries
//Choose a digit.
//Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- yu
//Enter exactly one character
//Choose a digit.
//Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- u
//You did not enter an acceptable character
//Choose a digit.
//Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 2
//You entered '2’
//-----------------------
//Enter 'C' or 'c' to continue, anything else to quit- c
//You entered 'c'
//Enter 'y', 'Y', 'n', or 'N'- N
//You entered 'N'
//Choose a digit.
//Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 9
//You entered '9’
//