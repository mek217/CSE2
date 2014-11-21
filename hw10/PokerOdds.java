////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//11/20/14
//Hw10
//Program PokerOdds
//
//
/*
Use the main method provided below and do not change it, then write the methods showOneHand() and simulateOdds().
*/

import java.util.Random;
import java.util.Scanner;

public class PokerOdds{
    public static void main(String [] arg){
        showHands();
//        simulateOdds();
        
    }
    
    public static void showHands(){
        Scanner scan = new Scanner(System.in);
        String answer="";
        do{
            int deck[]=new int[52];                                             //Make deck
            for(int i=0; i<52; i++){deck[i]=i;}
            
            int hand[]=new int[5];                                              //Make hand
            for(int j=0; j<5; j++){hand[j]=-1;}
            
            int chosenPosition=0, tempHand=0;                                   //Initialize variables
            for(int k=0; k<5; k++){                                             //Pick a random value for hand
                chosenPosition=(int)(Math.random()*(51-k));                     //Make chosenPosition equal a number between 0 and (51-k)
                tempHand=hand[k];                                               //Save hand[] value
                hand[k]=deck[chosenPosition];                                   //Move deck[chosenPosition] to hand[k]
                for(int l=chosenPosition; l<(51-k); l++){deck[l]=deck[l+1];}    //Remove deck[chosenPosition]from deck[] and shift values by 1
                deck[51-k]=tempHand;                                            //Move the -1 hand[k] value to the end of the deck
            }
            
            String clubs="Clubs:    ", diamonds="Diamonds: ", hearts="Hearts:   ", spades="Spades:   ";
            String[] cardinHand=new String[5];
            for(int m=0; m<5; m++){
                switch((hand[m]+1)%13){
                    case 9:  cardinHand[m]="J ";
                        break;
                    case 10: cardinHand[m]="Q ";
                        break;
                    case 11: cardinHand[m]="K ";
                        break;
                    case 12: cardinHand[m]="A ";
                        break;
                    default: cardinHand[m]=Integer.toString(hand[m]+2)+" ";
                        break;
                }
                switch(hand[m]/13){
                    case 0: clubs+=cardinHand[m];
                        break;
                    case 1: diamonds+=cardinHand[m];
                        break;
                    case 2: hearts+=cardinHand[m];
                        break;
                    case 3: spades+=cardinHand[m];
                        break;
                }
            }
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }while(answer.equals("y") || answer.equals("Y"));
    }
    
}


/*
  rank   freq of exactly one pair
    A       312
    K       307
    Q       339
    J       325
   10       323
    9       334
    8       363
    7       312
    6       339
    5       349
    4       328
    3       293
    2       327
----------------------------
 total not exactly one pair: 5749
*/