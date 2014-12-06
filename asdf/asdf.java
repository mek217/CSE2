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
        int[][] start = new int[5][];                                           //start.length: 3
        for(int i=0;i<start.length;i++){
            start[i]=new int[2*i+3];                                            //start[w].length: 3+2x
            for(int j=0;j<start[i].length;j++){
                start[i][j]=(int)(Math.random()*10);
            }
        }
        
        System.out.println("Before sorting");
        for(int k=0;k<start.length;k++){
            for(int l=0;l<start[k].length;l++){
                System.out.print(start[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        int v=0, w=0, x=0, y=0, z=0, smallest=0;
        for(w=0;w<start.length;w++){                                            //Number Row
            for(x=0;x<start[w].length;x++){                                     //Number Element
                for(y=x;y<start[w].length;y++){                                 //Sort
                    smallest=0;
                    for(z=y;z<start[w].length;z++){                             //Search row for smallest element
                        if(start[w][z]<start[w][x]){smallest=z;}
                    }
                    if(start[w][y]>start[w][smallest]){                         //Swap Number element with smallest element
                        int temp=start[w][y];
                        start[w][y]=start[w][smallest];
                        start[w][smallest]=temp;
                    }
                }
            }
        }
        
        
        System.out.println("After sorting");
        for(int k=0;k<start.length;k++){
            int temp=start[k][0];
            for(int l=0;l<start[k].length;l++){
                start[k][l]=(l<start[k].length-1)?start[k][l+1]:temp;
                System.out.print(start[k][l]+" ");
            }
            System.out.println();
        }
    }
}