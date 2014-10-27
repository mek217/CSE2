///////////////////////
//      TESTING      //
///////////////////////

// for n=4:
//    1    //Every line is 2n+1 lines long:
//    -    //Line 1 has n spaces to the left and right of the number
//   222   //Line 2 has n-1 spaces to the left and right of the numbers
//   222   
//   ---   
//  33333  //Line 3 has n-2 spaces to the left and right of the numbers
//  33333  
//  33333  
//  -----  
// 4444444 // Line 4 has n-3 spaces to the left and right of the numbers
// 4444444 
// 4444444 
// 4444444 
// ------- 


import java.util.Scanner;
public class asdf{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a, b, c;
    System.out.println("Enter three ints");
    a = getInt(scan);
    b = getInt(scan);
    c = getInt(scan);
    System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
    System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + larger(a, larger(b, c)));
    System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
  }

  public static int getInt(Scanner scan) {
    
    while (true) {
      System.out.println("Enter an int: ");
      if (!scan.hasNextInt()) {
        scan.next();
        continue;
      }
      else {  return scan.nextInt();  }
    
  }


  public static int larger (int a, int b) { return a; }
  
  public static Boolean ascending (int num1, int num2, int num3) { return true;}
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