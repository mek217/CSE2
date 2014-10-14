///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;
public class asdf{
    public static void main(String[] args){
        
        //initialize sentinal variables
        int thousandSent = 0, spinSent = 0;
        
        //initialize variables to keep track
        int winCount = 0;
        int totalLoss = 0, netGain = 0;
        int totalMoney = 0;
        
        //initialize game variables
        int betNum = 0;
        int playNum = 0;
        final int WIN$ = 36;
        
        //In simulation
        while(thousandSent < 1000){
            thousandSent++;
            
            //Make sure to reset the sentinal values in the nested loops after every run
            spinSent = 0;
            
            //Also reset winCount for each game
            winCount = 0;
            
            //Place a bet
            betNum = (int)(Math.random() * 38) + 1;
             
            //Spin 100 times
            while(spinSent++ < 100){
                
                //Randomize each played number
                playNum = (int)(Math.random() * 38) + 1;
                
                //Keep track of winCount
                if(playNum == betNum){
                    winCount++;
                }
            }
            
            //After game, calculate if there was a net gain or total loss
            if(winCount >= 3){
                netGain++;
            }
            else if(winCount == 0){
                totalLoss++;
            }
            //Add to the money gained over 1000 simulations
            totalMoney += winCount * WIN$;
        }
        
        //Print results
        System.out.println("Out of the 1000 simulations of 100 spins of a Roulette table, ");
        System.out.println("You profited from the table " + netGain + " times, ");
        System.out.println("You lost all your money " + totalLoss + " times, ");
        System.out.println("And you recieved $" + totalMoney + " in winnings. ");
        System.out.println("However, this is how much you would receive ");
        System.out.println("AFTER you spend $100,000 from joining the table a thousand times. ");
    }
}