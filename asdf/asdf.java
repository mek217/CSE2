///////////////////////
//      TESTING      //
///////////////////////


import java.util.Scanner;
public class asdf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char userChar;
        System.out.print("Enter the letter c: ");
        String cont = scan.next();
        // 'c'
        if(cont.equals("c")){
            userChar = cont.charAt(0);
            System.out.println("userChar: " + userChar);
            System.out.println("userChar equals "+ userChar);
        }
        else{
            System.out.println("something went wrong because cont is: " + cont);
        }
    }
}