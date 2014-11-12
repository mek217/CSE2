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
public class asdf {
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
            String spacing = (tenArray[l]<0) ? "" : " ";                        //Account for number length
            spacing = (tenArray[l]*tenArray[l]<100) ? spacing+"    " : spacing+"   ";
            System.out.println("     " + tenArray[l] + spacing + reverseArray[l]);
        }
        
    }
}