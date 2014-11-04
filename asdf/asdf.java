///////////////////////
//      TESTING      //
///////////////////////

////////////////////////////////////////////////////////////////////////////
//Matthew Koh
////14
//Lab/Hw
//Program Name
//
//Start

import java.util.Scanner;

import java.util.Scanner;
public class asdf {
    public static void main(String[] arg) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
/*
Problems & Solutions
[B]: allBlocks(int x): Must print the 'stack' of blocks
    [B1]: block(): print each individual block with same width
        [B1a]: line(): generate each line with the right numbers and indent distance
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
    
/*
ALL BLOCKMAKING VARIABLES
All variables: int x, int whichBlock, int whichLineInBlock, int whichNumberInLine, int whichSpace, int numNums, int spaces, int numBlock, int dashes, dashes

Sentry Variables: REMEMBER TO RESET
which Block
    increment up
        whichBlock = 1
            In: allblocks, block, line
which Line
    increment up
        whichLineInBlock = 1
            In: allblocks, block
which Number
    increment up
        whichNumberInLine = 1
            In: allblocks, block, line
which Space
    increment up
        whichSpace = 1
            In: line
            
Actual Variables:

how many total blocks are being made(in the program)?
    int x = # blocks
        The user input x: there will be x blocks.
            In: allblocks, block, line
    
how many total lines are being entered (in the block)?
    int whichBlock = # lines
        Whichever block you are on will have that many lines in the block.
            In: allblocks, block, line
        
how many total numbers being printed(in the line)?
    int numNums = 2*whichBlock-1 = # numbers
        Whichever block you are on will have (2*whichBlock-1) numbers printed on the line.
            In: line
        
how many spaces (on left and right)?
    int spaces = x - whichBlock
        Every line will have  ((2x-1) - (2*whichBlock-1))/2
                            = (2x-1-2*whichBlock+1)/2
                            = (2x-2*whichBlock/2)
                            = 2(x-whichBlock)/2
                            = (x-whichBlock) spaces to the left and to the right of the printed numbers.
            In: line

what about the lines after each block?
    Make sure to print a line when 
        HAVE numBlock EQUAL dashes INSTEAD OF whichBlock WHEN PRINTING THE ADDITIONAL LINE
    PRINT AN ADDITIONAL LINE WITH -'S INSTEAD OF whichBlock WHEN whichBlock == whichLineInBlock
*/
    public static void allBlocks(int x){
        int whichBlock = 1;
        for(whichBlock = 1; whichBlock <= x; whichBlock++){
            block(x, whichBlock);
        }
        return;
        //All variables: int x, int whichBlock, int whichLineInBlock, int whichNumberInLine, int whichSpace, int numNums, int spaces, int numBlock, int dashes
        //NEED: x
        //MADE: whichBlock
    }
    
    public static void block(int x, int whichBlock){
        int whichLineInBlock = 1;
        int numBlock = whichBlock, dashes = 0;
        for(whichLineInBlock = 1; whichLineInBlock <= whichBlock; whichLineInBlock++){
            line(x, whichBlock, whichLineInBlock, numBlock);
            System.out.println();
            if(whichLineInBlock == whichBlock){
                line(x, whichBlock, whichLineInBlock, dashes);
                System.out.println();
            }
        }
        return;
        //All variables: int x, int whichBlock, int whichLineInBlock, int whichNumberInLine, int whichSpace, int numNums, int spaces, int numBlock, int dashes
        //NEED: x, whichBlock, 
        //MADE: whichLineInBlock, numBlock, dashes
    }
    
    public static void line(int x, int whichBlock, int whichLineInBlock, int numBlock){
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
        //System.out.print("whichBlock: "+whichBlock+" whichLineInBlock: "+whichLineInBlock+" whichNumberInLine: "+whichNumberInLine);
        return;
        //All variables: int x, int whichBlock, int whichLineInBlock, int whichNumberInLine, int whichSpace, int numNums, int spaces, int numBlock, int dashes
        //NEED: x, whichBlock, whichLineInBlock, numBlock/dashes
        //MADE: spaces, numNums, whichSpace, whichNumberInLine
    }

}

/*
allBlocks(int x) (how many blocks) makes number of blocks
block() (the stuff in each block) makes number of lines
line() (the stuff in each line) makes proper numbers and indent spacings
*/