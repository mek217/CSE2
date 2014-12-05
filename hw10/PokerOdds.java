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
    
    public static void showHands(){
        Scanner scan = new Scanner(System.in);
        String answer="";
        do{
            int[] hand=new int[5];                                              //Make hand
            for(int j=0; j<5; j++){hand[j]=-1;}
            
            hand=handMaker(hand);                                               //Call handMaker
            
            String clubs="Clubs:    ", diamonds="Diamonds: ", hearts="Hearts:   ", spades="Spades:   ";
            String[] cardInHand=new String[5];
            cardInHand=handMaker(cardInHand, hand);
            for(int m=0; m<cardInHand.length; m++){
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
        int[] hand=new int[5];                                                  //Make hand
        for(int j=0; j<5; j++){hand[j]=-1;}
        int noDup=0;
        for(int trials=0; trials<10000; trials++){                              //10000 trials: if random hand has exactly one dup, add 1 to thousandTries[theDup]
            hand=handMaker(hand);
            for(int x=0; x<hand.length; x++){
                hand[x]=(hand[x]+1)%13;
            }
            FindDuplicates finder = new FindDuplicates();
            boolean dupFound=false;
            int y=0, z=0;
            if(finder.exactlyOneDup(hand)){
                for(y=0, dupFound=false; y<hand.length; y++){
                    for(z=y+1; z<hand.length; z++){
                        if(hand[y]==hand[z]){
                            dupFound=true;
                            thousandTries[hand[z]]+=1;
                            break;
                        }
                        if(dupFound){break;}
                    }
                    if(dupFound){break;}
                }
            }else{noDup++;}
        }
        System.out.println("  rank   freq of exactly one pair");
        for(int card=0; card<13; card++){
            String leftSpace="   ";
            String rightSpace="       ";
            if(card!=8){leftSpace+=" ";}
            String[] cardInHand=new String[13];
            int[] deck=new int[52];                                             //Make deck
            for(int i=0; i<=51; i++){deck[i]=i;}
            cardInHand=handMaker(cardInHand, deck);
            System.out.println(leftSpace+cardInHand[card]+rightSpace+thousandTries[card]);
        }
        System.out.println("----------------------------");
        System.out.println(" total not exactly one pair: "+noDup);
    }
    
    public static int[] handMaker(int[] hand){
        int chosenPosition=0, tempHand=0;                                       //Initialize variables
        int[] deck=new int[52];                                                 //Make deck
        for(int i=0; i<=51; i++){deck[i]=i;}
        for(int k=0; k<hand.length; k++){                                       //Pick a random value for hand
            chosenPosition=(int)(Math.random()*(51-k));                         //Make chosenPosition equal a number between 0 and (51-k)
            tempHand=hand[k];                                                   //Save hand[] value
            hand[k]=deck[chosenPosition];                                       //Move deck[chosenPosition] to hand[k]
            for(int l=chosenPosition; l<(51-k); l++){deck[l]=deck[l+1];}        //Remove deck[chosenPosition]from deck[] and shift values by 1
            deck[51-k]=tempHand;                                                //Move the -1 hand[k] value to the end of the deck
        }
        return (hand);
    }
    
    public static String[] handMaker(String[] cardInHand, int[] hand){
        for(int m=0; m<cardInHand.length; m++){
            switch((hand[m]+1)%13){
                case 10: cardInHand[m]="J ";
                    break;
                case 11: cardInHand[m]="Q ";
                    break;
                case 12: cardInHand[m]="K ";
                    break;
                case 0:  cardInHand[m]="A ";
                    break;
                default: cardInHand[m]=Integer.toString(m+2)+" ";
                    break;
            }
        }
        return (cardInHand);
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