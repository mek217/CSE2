////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/20/14
//Hw07
//Program NumberStack
//
//Write the program, first using while, second using for, and third using do while loops
//
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
public class NumberStack{
    public static void main(String[] args){
        Scanner myScan;
        myScan = new Scanner(System.in);
        
        //WHILE LOOP
        //Prompt user to enter an int between 1 and 9
        System.out.print("Enter a number between 1 and 9- ");
        
        //Initialize input variable
        int userInput = 0;

        //wrap the user input validation in an infinite loop
        while(true){

            //Set/reset variable for user input
            userInput = 0;
            
            //Validate: user input is an int
            while(!myScan.hasNextInt()){
                
                myScan.next(); //get rid of the junk entered by user
                System.out.print("You did not enter an int; try again- ");
                
            }
            
            userInput = myScan.nextInt();
            
            //Validate: user input is an int between 1 and 9
            if(userInput < 1 || userInput > 9){
                
                //Reset user input variable
                userInput = 0;

                System.out.print("You did not enter an int between 1 and 9; try again- ");
                
                //If not between 1 and 9, then reset validation
                continue;

            }else{

                //If between 1 and 9, break from validation loop and continue with the rest of your life
                break;
                
            }
        }
        System.out.println();

        //Initialize Variables
        int blockSent = 0, lineSent = 0, spaces = userInput, spaceSent = 0, numbers = 1, numberSent = 0; 

        //Start while loop to build pyramid
        //Make (userInput) blocks
        while(blockSent < userInput){

            //Make number of lines
            while(lineSent < blockSent + 2){

                //Make spacing left of numbers
                while(spaceSent < spaces){
                    System.out.print(" ");
                    ++spaceSent;

                }
                
                //Reset inner loop sentinel value
                spaceSent = 0;

                //Make numbers
                while(numberSent < 2*numbers-1){

                    //Change last line into dashes instead of numbers
                    if(lineSent == blockSent + 1){
                        System.out.print('-');
                    }
                    else{
                        System.out.print(numbers);
                    }

                    ++numberSent;

                }
                
                //Set inner loop sentinel valu
                numberSent = 0;

                //Make spacing right of numbers
                while(spaceSent < spaces){
                    System.out.print(" ");
                    ++spaceSent;

                }

                //Reset inner loop sentinel value
                spaceSent = 0;

                //Next line in block
                System.out.println();
                ++lineSent;

            }

            //Reset inner loop sentinel value
            lineSent = 0;

//            //Print number of dashes equal to number of numbers
//            while(numberSent < numbers){
//                System.out.print('-');
//                ++numberSent;
//            }

            //Reset inner loop sentinel value
            numberSent = 0;

            //increment all values inside the loops
            spaces -= 1;
            numbers += 1;

            //Make new block
            System.out.println();
            ++blockSent;
        }
    }
}