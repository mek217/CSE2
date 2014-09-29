////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/26/14
//Lab05
//Program RandomGames
//
//Prompt user to enter one of the Strings R, r, C, c, P, or p
//Display an error & return if entered string is not of length 1
//Display an error & return if any other character other than “R” , “r”, “C”, “c”, “P”, “p” is entered
//If "R" or "r" entered: print results of a Roulette play
//If "C" or "c" entered: print results of the random outcome of two rolls of a dice
//If "P" or "p" entered: print results of a random draw from a deck of cards

//Import Scanner
import java.util.Scanner;

//Declare class
public class RandomGames{
    
    //Declare main
    public static void main(String[] args){
        
        //Declare instance of Scanner
        Scanner myScanner;
        
        //Call Scanner constructor
        myScanner = new Scanner ( System.in );
        
        //Prompt user to enter one of the Strings
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String startingLetter = myScanner.next();
        
        //Validate input: make sure entered string is of length 1
        if (startingLetter.length() == 1){
            
            //Roulette play
            if (startingLetter.equals("R") || startingLetter.equals("r")){
                
                //Declare variables to enter on printf line
                String roulette = "Roulette: ";
                int rouNumber = (int)(Math.random() * 36) + 1;
                
                //Print a Roulette play
                System.out.printf(roulette + "%02d %n", rouNumber);
                
            }
            //Craps play
            else if (startingLetter.equals("C") || startingLetter.equals("c")){
                
                //Declare variables to enter on print line
                int rollOne = (int)(Math.random() * 6) + 1;
                int rollTwo = (int)(Math.random() * 6) + 1;
                
                //Print a Craps play
                System.out.println("Craps: " + rollOne + " + " + rollTwo + " = " + rollOne+rollTwo);
                
            }
            else if (startingLetter.equals("P") || startingLetter.equals("p")){
                
                //Declare variables to enter on print line
                int cardNum = (int)(Math.random() * 13) + 1;
                int cardSuit = (int)(Math.random() * 4) + 1;
                
                //Name the suits
                String suit = "UNINITIALIZED";
                if (cardSuit == 1){
                    suit = "Spades";
                }
                if (cardSuit == 2){
                    suit = "Hearts";
                }
                if (cardSuit == 3){
                    suit = "Clubs";
                }
                if (cardSuit == 4){
                    suit = "Diamonds";
                }
                
                //Name 1 to ace, 11 to jack, 12 to queen, 13 to king
                String cardName = "UNINITIALIZED";
                if (cardNum == 1){
                    cardName = "Ace";
                }
                if (cardNum == 11){
                    cardName = "Jack";
                }
                if (cardNum == 12){
                    cardName = "Queen";
                }
                if (cardNum == 13){
                    cardName = "King";
                }
                
                //Print a Pick a card play. Numbers 1, 11, 12, and 13 require naming ace jack queen and king
                if (cardNum == 1 || cardNum == 10 || cardNum == 11 || cardNum == 12 || cardNum == 13){
                    System.out.println(cardName + " of " + suit);
                }
                else if (cardNum > 1 & cardNum < 11 ){
                    System.out.println(cardNum + " of " + suit);
                }
            }
            else{
                System.out.println("Entered letter is not R, r, C, c, P, or p");
                return;
            }
        }
        else{
            System.out.println("Single character expected");
            return;
        }
    }
}