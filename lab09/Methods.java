////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//10/26/14
//Lab09
//Program Methods
//
//Practice writing methods

import java.util.Scanner;
public class Methods {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter three ints");
    int a = getInt(scan);
    int b = getInt(scan);
    int c = getInt(scan);
    System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b) );
    System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + larger(a, larger(b, c)) );
    System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
  }

  public static int getInt(Scanner scan) {
    System.out.print("Enter an int: ");
    while (true) {
      if (!scan.hasNextInt()) {
        System.out.print("You did not enter an int; try again- ");
        scan.next();
        continue;
      }
      else {  return scan.nextInt();  }
    
  }
}

  public static int larger (int num1, int num2){ return (num1 >= num2) ? num1 : num2; }
  
  public static Boolean ascending (int num1, int num2, int num3) { return (num1 < num2 && num1 < num3 && num2 < num3) ? true : false; }
// return (num1 >= num2) ? num1 : num2; 
//(num1 < num2 && num1 < num3 && num2 < num3) ? true : false; 
  /*******SAMPLE RUNS:

  VALIDATION
  Enter three ints
  Enter an int- r
  You did not enter an int; try again- 3
  Enter an int- 8
  Enter an int- 9

  The larger of 3 and 8 is 8
  The larger of 3, 8, and 9 is 9
  It is true that 3, 8, and 9 are in ascending order



  VALIDATION
  Enter three ints
  Enter an int- 4
  Enter an int- 3
  Enter an int- 7

  The larger of 4 and 3 is 4
  The larger of 4, 3, and 7 is 7
  It is false that 4, 3, and 7 are in ascending order
  */
}