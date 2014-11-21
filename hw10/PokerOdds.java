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
        simulateOdds();
        
    }
    
    public static int[] handMaker(int[] hand, int[] deck){
        int chosenPosition=0, tempHand=0;                                       //Initialize variables
        for(int k=0; k<hand.length; k++){                                                 //Pick a random value for hand
            chosenPosition=(int)(Math.random()*(deck.length-k));                         //Make chosenPosition equal a number between 0 and (deck.length-k)
            tempHand=hand[k];                                                   //Save hand[] value
            hand[k]=deck[chosenPosition];                                       //Move deck[chosenPosition] to hand[k]
            for(int l=chosenPosition; l<(deck.length-k); l++){deck[l]=deck[l+1];}        //Remove deck[chosenPosition]from deck[] and shift values by 1
            deck[deck.length-k]=tempHand;                                                //Move the -1 hand[k] value to the end of the deck
        }
        return hand, deck;
    }
    
    public static void showHands(){
        Scanner scan = new Scanner(System.in);
        String answer="";
        do{
            int[] deck=new int[52];                                             //Make deck
            for(int i=0; i<52; i++){deck[i]=i;}
            
            int[] hand=new int[5];                                              //Make hand
            for(int j=0; j<5; j++){hand[j]=-1;}
            
            hand=handMaker(hand, deck);                             //Call handMaker
            
            String clubs="Clubs:    ", diamonds="Diamonds: ", hearts="Hearts:   ", spades="Spades:   ";
            String[] cardInHand=new String[5];
            for(int m=0; m<cardInHand.length; m++){
                switch((hand[m]+1)%13){
                    case 9:  cardInHand[m]="J ";
                        break;
                    case 10: cardInHand[m]="Q ";
                        break;
                    case 11: cardInHand[m]="K ";
                        break;
                    case 12: cardInHand[m]="A ";
                        break;
                    default: cardInHand[m]=Integer.toString(hand[m]+2)+" ";
                        break;
                }
                switch(hand[m]/13){
                    case 0: clubs+=cardInHand[m];
                        break;
                    case 1: diamonds+=cardInHand[m];
                        break;
                    case 2: hearts+=cardInHand[m];
                        break;
                    case 3: spades+=cardInHand[m];
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
    
    public static void simulateOdds(){
        int[] thousandTries=new int[13];
        for(int z=0; z<thousandTries.length; z++){thousandTries[z]=0;}          //Initialize thousandTries array
        int noDup=0, theDup;
        for(int trials=0; trials<10000; trials++){                              //10000 trials: if random hand has exactly one dup, add 1 to thousandTries[theDup]
            handMaker(hand, deck);
            if(FindDuplicates.exactlyOneDup(hand);){
                for(int dupFinder=0; dupFinder<hand.length-1; dupFinder++){
                    for(theDup=dupFinder+1; theDup<hand.length; theDup++){
                        if(hand[theDup]==hand[dupFinder]){break;}
                    }
                    if(hand[theDup]==hand[dupFinder]){break;}
                }
                thousandTries[theDup]+=1;
            }else{noDup++;}
        }
        System.out.println("  rank   freq of exactly one pair")
        for(int card=0; card<13; card++){
            String leftSpace="   ";
            String rightSpace="       ";
            if(card!=8){leftSpace+=" "};
            System.out.println(leftSpace+cardInHand+rightSpace+thousandTries[card]);
        }
        System.out.println("----------------------------");
        System.out.println(" total not exactly one pair: "+noDup);
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