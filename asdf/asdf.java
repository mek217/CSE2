///////////////////////
//      TESTING      //
///////////////////////

import java.util.Scanner;
public class asdf{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        
        System.out.print("Enter an int- ");
        if(!scan.hasNextInt()){
            do{
                scan.next(); //get rid of the junk entered by user
                System.out.print("You did not enter an int; try again- ");
            }while(!scan.hasNextInt());
        }
        
        n = scan.nextInt();
        
        int j=0, k=0;
        
        while(j < n && j < 40){
            
            k=0;
            while(k < j + 1){
                System.out.print('*');
                k++;
            }
            System.out.println();
            
            j++;
        }
        
        k = 4;
        
        System.out.println("k=" + k);
        k++;
        while(k < 4){
            System.out.println("k=" + k);
            k++;
        }
        
        for(int count=0; true; count++){
            if(count == 0){
                count++;
            }
            if(n == 1){
            }
            if(n == 1 || n == 2){
                System.out.print("Case 2 ");
                continue;
            }
            if(n == 1 || n == 2 || n == 3){
                break;
            }
            if(n == 4){
                System.out.println("Case 4");
            }
            if(n == 4 || n == 5){
                System.out.println("Case 5");
            }
            else{
                System.out.println(n + " is > 5 or <1");
            }
            System.out.println("count: " + count);
            if(count > 3){
                break;
            }
        }
    }
}