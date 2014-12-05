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

import java.util.Random;
import java.util.Scanner;
public class asdf{
    public static void main(String args[]){
        String x[] = {"one", "two", "to", "fifteen", "three"};
        int[] numberLength = new int[x.length];
        for(int i=0; i<x.length; i++){
            numberLength[i]=x[i].length();
        }
        for(int j = 0; j<x.length; j++){
            System.out.println(numberLength[j] + "");
        }
    }
}