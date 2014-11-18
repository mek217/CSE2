////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//11/11/14
//Lab 11
//Program Arrays
//
//Create an array that can hold 10 ints
//Ask the user enter 10 ints and store them in the array
//Search the array for the highest entry and print it out
//Search the array for the lowest entry and print it out
//Sum the ints in the array and print out the sum
//Copy the contents of the array into a second array in reverse order 
//Print the contents of the two arrays in two columns, side by side. 
//Below is sample output that your program should resemble:

/*Enter 10 ints- -9 20 8 9 23 45 1 2 89 70
The lowest entry is -9
The highest entry is 89
The sum is 258
    -9     70
    20     89
     8      2
     9      1
    23     45
    45     23
     1      9
     2      8
    89     20
    70     -9

    */

import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        final int TEN_INT_ARRAY = 10;
        int[] tenArray = new int[TEN_INT_ARRAY];
        
        System.out.print("Enter 10 ints- ");                                    //Prompt user to enter 10 ints for array
        for(int i=0; i<TEN_INT_ARRAY; i++){
            tenArray[i] = scan.nextInt();
        }
        
        int min = tenArray[0], max = tenArray[0], sum = 0;                      //Search min and max entries
        for(int j=0; j<TEN_INT_ARRAY; j++){
            if(tenArray[j]<min){min = tenArray[j];}
            if(tenArray[j]>max){max = tenArray[j];}
            sum += tenArray[j];
        }
        
        System.out.println("The lowest entry is " + min);                       //Print highest, lowest, and sum
        System.out.println("The highest entry is " + max);
        System.out.println("The sum is " + sum);
        
        int[] reverseArray = new int[TEN_INT_ARRAY];                             //Copy contents of the array into second arry in reverse order
        for(int k=0; k<TEN_INT_ARRAY; k++){
            reverseArray[k] = tenArray[(TEN_INT_ARRAY-1)-k];
        }
        
        
        for(int l=0; l<TEN_INT_ARRAY; l++){
            String space1 = "    ", space2 = "    ";
            space1 = 
/*
FIRST
    1digit: +5
    -1digit: +4
    2digit: +4
    -2digit: +3

SECOND
*/
            String spacing = (tenArray[l]<0) ? "" : " ";                        //Account for number length
            spacing = (tenArray[l]*tenArray[l]<100) ? spacing+"    " : spacing+"   ";
            System.out.println("     " + tenArray[l] + spacing + reverseArray[l]);
        }
        
    }
}