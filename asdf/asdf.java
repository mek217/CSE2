///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;
public class asdf{
    public static void main(String[] args){
        Scanner myScan;
        myScan = new Scanner(System.in);
        
        
        int i = 120;
        int j = 0;
        
        do{
            i = i-6;
            System.out.println("i: " + i);
            
            for(j = 0; j<5; j++){
                System.out.println("j: " + j);
            }
        }while(i > 0);
        
        //for (i = 0; i < 5; system.out.print("enter an int") ){
        //    i = myScan.nextInt();
        //    System.out.println("i: " + i);
        //}

    }
}