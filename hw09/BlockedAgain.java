////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//11/3/14
//Hw09
//Program BlockedAgain
//
/*
Problems & Solutions
[A]: getInt(): Prompt user for an int
    [A1]: checkInt(): input is an int
    [A2]: checkRange(): input is positive
[B]: allBlocks(int x): Must print the 'stack' of blocks
    [B1]: block(): print each individual block with same width
        [B1a]: line(): generate each line with the right numbers and indent distance
*/

import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
/*
Problems & Solutions

    
        
*/

    public static int getInt() {                                                //[A]: getInt(): Prompt user for an int
        Scanner scan;
        scan = new Scanner(System.in);
        boolean isDigit = false;
        int userInput = 0;
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        while (isDigit != true){
            userInput = checkInt(scan);                                         //[A1]: checkInt()
            isDigit = checkRange(userInput);                                    //[A2]: checkRange()
            if(isDigit == false){
                System.out.print("You did not enter an int in [1,9]; try again: ");
                continue;
            }else{break;}
        }
        return userInput;
    }

    public static int checkInt(Scanner scan){                                   //[A1]: checkInt(): input is an int
        while(true){
            if(scan.hasNextInt()){
                int userNumber = scan.nextInt();
                boolean ifPositive = checkRange(userNumber);
                return userNumber;
            }
            else{
                System.out.print("You did not enter an int. try again: ");
                scan.next();
                continue;
            }
        }
    }

    public static boolean checkRange(int testInt){                              //[A2]: checkRange(): input is positive
        boolean posTest = (testInt >= 1 && testInt <= 9)?true:false;
        return posTest;
    }
    
    public static void allBlocks(int x){                                        //[B]: allBlocks(int x): Must print the 'stack' of blocks
        int whichBlock = 1;
        for(whichBlock = 1; whichBlock <= x; whichBlock++){
            block(x, whichBlock);                                               //[B1]: block()
        }
        return;
        //NEED: x
        //MADE: whichBlock
    }
    
    public static void block(int x, int whichBlock){                            //[B1]: block(): print each individual block with same width
        int whichLineInBlock = 1;
        int numBlock = whichBlock, dashes = 0;
        for(whichLineInBlock = 1; whichLineInBlock <= whichBlock; whichLineInBlock++){
            line(x, whichBlock, whichLineInBlock, numBlock);                    //[B1a]: line()
            System.out.println();
            if(whichLineInBlock == whichBlock){
                line(x, whichBlock, whichLineInBlock, dashes);                  //[B1a]: line()
                System.out.println();
            }
        }
        return;
        //NEED: x, whichBlock, 
        //MADE: whichLineInBlock, numBlock, dashes
    }
    
    public static void line(int x, int whichBlock, int whichLineInBlock, int numBlock){     //[B1a]: line(): generate each line with the right numbers and indent distance
        int spaces = x - whichBlock;
        int numNums = 2*whichBlock-1;
        int whichSpace = 1;
        int whichNumberInLine = 1;
        for(whichSpace = 1; whichSpace <= spaces; whichSpace++){
            System.out.print(' ');
        }
        for(whichNumberInLine = 1; whichNumberInLine <= numNums; whichNumberInLine++){
            if(numBlock > 0){
                System.out.print(numBlock);
            }else{System.out.print("-");}
            
        }
        for(whichSpace = 1; whichSpace <= spaces; whichSpace++){
            System.out.print(' ');
        }
        return;
        //NEED: x, whichBlock, whichLineInBlock, numBlock/dashes
        //MADE: spaces, numNums, whichSpace, whichNumberInLine
    }

}

/*
allBlocks(int x) (how many blocks) makes number of blocks
block() (the stuff in each block) makes number of lines
line() (the stuff in each line) makes proper numbers and indent spacings
*/