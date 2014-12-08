////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//12/5/14
//Hw 11
//Program Poker Hands
/*
Winning hands, best to worst:
Royal Flush (10, J, Q, K, A)
Straight Flush (5 suit, consecutive)
Four of a Kind (x, x, x, x, y)
Full House (x, x, x, y, y)
Flush (5 suit)
Straight (consecutive)
Two Pair
One Pair
High Card
*/

import java.util.Scanner;
public class PokerHands{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int[][] deck=new int[4][13];
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
            for(int j=0;j<deck[i].length;j++){
                deck[i][j]=j;
            }
        }
        
        while(true){
            if(!replay(scan)){break;}
            int[] hand=handMaker(scan, deck);
            
            
            
        }
    }
    
    public static boolean replay(Scanner scan){
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String input=scan.next();
        Boolean reply=(input.equals("Y")||input.equals("y"))?true:false;
        return reply;
    }
    
    public static int[] handMaker(Scanner scan, int[][] deck){
        int[] hand=new int[5];
        for(int i=0;i<hand.length;i++){
            hand[i]=pickACard(scan, deck);
        }
    }
    
    public static int pickACard(Scanner scan, int[][] deck){
        int card=suit(scan)*13+cardNum(scan);
        return card;
    }
    
    public static int suit(Scanner scan){
        while(true){
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
            String input=scan.next();
            int suit=0;
            if(input.equals("c")||input.equals("d")||input.equals("h")||input.equals("s")){
                if(input.equals("c")){suit=0;}
                else if(input.equals("d")){suit=1;}
                else if(input.equals("h")){suit=2;}
                else if(input.equals("s")){suit=3;}
                break;
            }
            else{
                System.out.println("You did not enter a valid response");
                continue;
            }
        }
        return suit;
    }
    
    public static int cardNum(Scanner scan, int[][] deck){
        while(true){
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 3");
            String input=scan.next();
            int cardNum=0;
            if(input.equals("a"||input.equals("k")||input.equals("q")||input.equals("j"))){
                if(input.equals("k")){suit=0;}
                else if(input.equals("a")){cardNum=1;}
                else if(input.equals("j")){cardNum=11;}
                else if(input.equals("q")){cardNum=12;}
            }
            else if(){
                
            }
            else if()
            else{
                System.out.println("You did not enter a valid response");
                continue;
            }
            return cardNum;
        }
    }
    
}

