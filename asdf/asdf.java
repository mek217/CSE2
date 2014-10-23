///////////////////////
//      TESTING      //
///////////////////////

// for n=4:
//    1    //Every line is 2n+1 lines long:
//    -    //Line 1 has n spaces to the left and right of the number
//   222   //Line 2 has n-1 spaces to the left and right of the numbers
//   222   
//   ---   
//  33333  //Line 3 has n-2 spaces to the left and right of the numbers
//  33333  
//  33333  
//  -----  
// 4444444 // Line 4 has n-3 spaces to the left and right of the numbers
// 4444444 
// 4444444 
// 4444444 
// ------- 


import java.util.Scanner;
public class asdf{
    public static void main(String[] args){
        Scanner myScan;
        myScan = new Scanner(System.in);
        
        
        //WITH FOR LOOPS
        //Prompt user to enter an int between 1 and 9
        System.out.print("Enter a number between 1 and 9- ");
        
        //Initialize input variable
        int userInput = 0;
        
        //wrap the user input validation in an infinite loop
        for( ; true; ){
            
            //Set/reset variable for user input
            userInput = 0;
            
            //Validate: user input is an int
            for(;!myScan.hasNextInt();){
                myScan.next(); //get rid of the junk entered by the user
                System.out.print("You did not enter an int; try again- ");
                
            }
            
            userInput = myScan.nextInt();
            
            //Validate: user input is an int between 1 and 9
            if(userInput < 1 || userInput > 9){
                
                //Reset user input variable
                userInput = 0;
                
                System.out.print("You did not enter an int between 1 and 9; try again-");
                
                //If not between 1 and 9, then reset validation
                continue;
            }
            else{
                
                //If between 1 and 9, break from validation loop and continue
                break;
                
            }
        }
        
        System.out.println("Using do while loops: ");

        //Initialize Variables
        int blockSent = 0;
        int lineSent = 0;
        int spaces = userInput;
        int spaceSent = 0;
        int numbers = 1;
        int numberSent = 0; 
        
        
        if(blockSent < userInput){
            do{
                
                if(lineSent < blockSent + 2){
                    do{

                        //Make spacing left of numbers
                        if(spaceSent < spaces){
                            do{
                                System.out.print(" ");
                                ++spaceSent;
                            }
                            while(spaceSent < spaces);
                        }
                        
                        //Reset inner loop sentinel value
                        spaceSent = 0;
                        
                        //Make numbers
                        if(numberSent < 2*numbers-1){
                            do{
                                    //Change last line into dashes instead of numbers
                                if(lineSent == blockSent + 1){
                                    System.out.print('-');
                                }
                                else{
                                    System.out.print(numbers);
                                }
                                
                                ++numberSent;
                            }
                            while(numberSent < 2*numbers-1);
                        }
                        
                        //Set inner loop sentinel value
                        numberSent = 0;
                        
                        //Make spacing right of numbers
                        if(spaceSent < spaces){
                            do{
                                System.out.print(" ");
                                ++spaceSent;
                                
                            }
                            while(spaceSent < spaces);
                        }
                        
                        //Reset inner loop sentinel value
                        spaceSent = 0;
                        
                        //Next line in block
                        System.out.println();
                        ++lineSent;
                        
                    }
                    while(lineSent < blockSent + 2);
                }
                

                //Reset inner loop sentinel value
                lineSent = 0;
                
                //Reset inner loop sentinel value
                numberSent = 0;
                
                //increment all values inside the loops
                spaces -= 1;
                numbers += 1;
                
                //Make new block
                ++blockSent;
            }
            while(blockSent < userInput);
        }
    }
}