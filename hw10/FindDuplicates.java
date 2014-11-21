////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//11/17/14
//Hw10
//Program FindDuplicates
//
//
/*
Write the methods hasDups() and exactlyOneDup()

Method hasDups():
    Returns true if and only if the input array has at least one repeated entry.
    
    
    
Method exactlyOneDup():
    Returns true if and only if there is exactly one repeated entry 
    (Ex: exactlyOneDup() is true for {2, 7, 2}, false for {2, 2, 2, 3, 4} and false for {2, 2, 3, 3})

*/
import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0; j<10; j++){num[j]=scan.nextInt();}
            String out="The array ";
            out+=listArray(num);                                                //return a string of the form "{2, 3, -9}"
            if(hasDups(num)){out+="has ";}                                      //hasDups(num) returns true iff(if and only if) entries repeat
            else{out+="does not have ";}
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);
            if(exactlyOneDup(num)){out+="has ";}                                //exactlyOneDup(num) returns true iff there is exactly one repeated entry
            else{out+="does not have ";}
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static String listArray(int num[]){                                  //prints the array
        String out="{";
        for(int j=0; j<num.length; j++){
            if(j>0){out+=", ";}
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static boolean hasDups(int[] list){
        boolean anyDups=false;
        for(int k=0; k<list.length; k++){                                       //increments the 'sentry' element of the array
            for(int l=k+1; l<list.length; l++){                                 //compares sentry element with every nonchecked element in set
                if(list[k]==list[l]){anyDups=true;}
            }
        }
        return anyDups;
    }
    
    public static boolean exactlyOneDup(int[] list){
        boolean onlyOne=false;
        for(int m=0; m<list.length; m++){
            for(int n=m+1; n<list.length; n++){
                if(onlyOne==false&&list[m]==list[n]){onlyOne=true;}             //onlyOne returns true only the first time list[m]==list[n]
                else if(onlyOne==true&&list[m]==list[n]){return false;}         //exactlyOneDup() otherwise returns false
            }
        }
        return onlyOne;
    }
}