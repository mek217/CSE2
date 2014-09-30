////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/29/14
//Hw05
//Program BoolaBoola
//
//Randomly assign true or false values to 3 boolean variables
//Combine the 3 variables with random choices of && and ||, and store the result
//Present the expression to the user and ask the user to state the result

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner ( System.in );
        
        //Declare and initialize variables
        int numrandom = 0;
        boolean snap = false;
        boolean crackle = false;
        boolean pop = false;
        boolean boolaBoola = false;
        String userInput = "n/a";
        boolean userBoola = false;
        
        //Set 3 booleans to true if random number greater than .5
        numrandom = (int)(Math.random()*2) + 1;
        if(numrandom == 2){
            snap = true;
        }
        numrandom = (int)(Math.random()*2) + 1;
        if(numrandom == 2){
            crackle = true;
        }
        numrandom = (int)(Math.random()*2) + 1;
        if(numrandom == 2){
            pop = true;
        }
        
        //Use numrandom in a switch statement to randomize choices of && and ||
        numrandom = (int)(Math.random()*4) + 1;
        switch(numrandom){
            case 1:
                boolaBoola = (snap || crackle && pop);
                System.out.println(boolaBoola);
                System.out.println(userBoola);
                System.out.print("Does " + snap + " || " + crackle + " && " + pop + " have the value true(t/T) or false(f/F)?");
                
                //Accept user input
                userInput = myScanner.next();
                
                //Translate user input into a boolean
                if(userInput.equals("T") | userInput.equals("t")){
                    userBoola = true;
                }
                else if(userInput.equals("F") | userInput.equals("f")){
                    userBoola = false;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
                //Calculate if user is correct or not
                if(userBoola == boolaBoola){
                    System.out.println("Correct");
                    return;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
            case 2:
                boolaBoola = (snap && crackle || pop);
                System.out.println(boolaBoola);
                System.out.println(userBoola);
                System.out.print("Does " + snap + " && " + crackle + " || " + pop + " have the value true(t/T) or false(f/F)?");
                
                //Accept user input
                userInput = myScanner.next();
                
                //Translate user input into a boolean
                if(userInput.equals("T") | userInput.equals("t")){
                    userBoola = true;
                }
                else if(userInput.equals("F") | userInput.equals("f")){
                    userBoola = false;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
                //Calculate if user is correct or not
                if(userBoola == boolaBoola){
                    System.out.println("Correct");
                    return;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
            case 3:
                boolaBoola = (snap || crackle || pop);
                System.out.println(boolaBoola);
                System.out.println(userBoola);
                System.out.print("Does " + snap + " || " + crackle + " || " + pop + " have the value true(t/T) or false(f/F)?");
                
                //Accept user input
                userInput = myScanner.next();
                
                //Translate user input into a boolean
                if(userInput.equals("T") | userInput.equals("t")){
                    userBoola = true;
                }
                else if(userInput.equals("F") | userInput.equals("f")){
                    userBoola = false;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
                //Calculate if user is correct or not
                if(userBoola == boolaBoola){
                    System.out.println("Correct");
                    return;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
            case 4:
                boolaBoola = (snap && crackle && pop);
                System.out.println(boolaBoola);
                System.out.println(userBoola);
                System.out.print("Does " + snap + " && " + crackle + " && " + pop + " have the value true(t/T) or false(f/F)?");
                
                //Accept user input
                userInput = myScanner.next();
                
                //Translate user input into a boolean
                if(userInput.equals("T") | userInput.equals("t")){
                    userBoola = true;
                }
                else if(userInput.equals("F") | userInput.equals("f")){
                    userBoola = false;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
                //Calculate if user is correct or not
                if(userBoola == boolaBoola){
                    System.out.println("Correct");
                    return;
                }
                else{
                    System.out.println("Wrong; try again");
                    return;
                }
                
        }
    }
}