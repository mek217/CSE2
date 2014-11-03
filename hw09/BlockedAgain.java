////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//11/3/14
//Hw09
//Program BlockedAgain
//
/*
Problems & Solutions
[A]: getInt(): Must ask user for an acceptible size of desired block output
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
}