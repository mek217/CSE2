////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/12/14
//Lab06
//Program Roulette
//
//Make a program that plays a 100 spin game of Roulette, and have it run 1000 times.
//Then, record data, and report the outcome.
//
//HOW TO PLAY
//There are 38 possible numbers to bet on, per spin.
//If my chosen number comes up, I win $36.
//I must win at least 3 times to win money. Otherwise, I will lose money.
//Spin 100 times. 
//
//SIMULATION
//Run Simulation 1000 times. Record:
//  How many times I lose everything (chosen numbers do not come up)
//  How many times I won with a profit
//  Total winnings

import java.util.Scanner

public class Roulette {
    public static void main(String[] args){
        Scanner myScan;
        myScan = new Scanner(System.in);
        
        //Infinite loop for Roulette Simulation.
        while(true){
            //Prompt user to exit or stay
            System.out.println("This is Roulette Simulation. Press y or Y to start a thousand 100 spin games- ");
            String startRoulette = myScan.next();
            if(startRoulette.equals("y") || startRoulette.equals("Y")){
            }
            else{
                System.out.println("Y or y was not pressed. Exiting Roulette Simulation.");
                break;
            }
            
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
}