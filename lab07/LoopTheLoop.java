////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/9/14
//Lab07
//Program LoopTheLoop
//

import java.util.Scanner;

public class LoopTheLoop{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        int nStars = 10;
        
        while(nStars>0){
            System.out.print('*');
            nStars--;
            if(nStars == 0){
                System.out.println("");
                System.out.println("");
            }
        }
        
        //Reset nStars for Part 2
        nStars = 10;
        
        //Variable for number of lines, and stars on each line
        int nLine = 0;
        int sentLine = 0;
        
        //Start loop
        while(nStars > 0){
            
            //First, as you decrease nStars, increase nCheck.
            nStars--;
            nLine++;
            sentLine = 0;
            
            //Each line should have stars equal to line number
            while(nLine>sentLine){
                System.out.print('*');
                sentLine++;
                
                //Next line and reset line and stars
                if(nLine == sentLine){
                    System.out.println("");
                    break;
                }
            }
        
            //Break from loop when nStars = 0
            if(nStars == 0){
                System.out.println("");
                break;
            }
        }
        
        //Prompt for user input
        System.out.print("Enter an int between 1 and 15- ");
        
        //Validate: input is an int
        if(myScanner.hasNextInt()){
            
            //Accept user input
            int userInput = myScanner.nextInt();
            
            //Validate: input is an int between 1 and 15
            if(userInput>=0 && userInput<=15){
                
                //Reset variables for Part 3
                nStars = userInput;
                nLine = 0;
                sentLine = 0;
                
                //Start loop
                while(nStars>0){
                    nStars--;
                    nLine++;
                    sentLine = 0;
                    
                    //Every line needs number of stars == nline
                    while(nLine>sentLine){
                        System.out.print('*');
                        sentLine++;
                        
                        //Next line and reset line and stars
                        if(nLine == sentLine){
                            System.out.println("");
                            break;
                        }
                    }
                    
                    //Break out of loop when nStars == 0
                    if(nStars == 0){
                        System.out.println("");
                        break;
                    }
                }
            }
            else{
                System.out.println("User did not enter an int between 1 and 15");
            }
        }
        else{
            System.out.println("User did not enter an int");
            return;
        }
    }
}