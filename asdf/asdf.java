///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;

public class asdf{
    
    public static void main(String[] args){
        
        int n=40,k=60;
        
        String out="";
        
        switch(k%14){
            
            case 12: 
            case 13: out+=13;
                break;
            default: out+=40;
                n/=3;
                k-=7;
        }
        if(n*k%12< 12){
            n-=20;
            out+=n;
        }
        if(n*n>k){
            n=42;
            out+=n+k;
        }
        else {
            n=45;
            out+=n+k;
        }
        switch(n+k){
            case 114: 
                n-=11;
                k-=3;
                break;
            case 97:
                n-=14;
                k-=2;
                break;
            case 98:
                n/=5;
                k/=9;
                break;
            default:
                n-=3;
                k-=5;
                break;
        }
        System.out.println("n: " + n + " k: " + k);
    }
}