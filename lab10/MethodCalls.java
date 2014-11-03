import java.util.Scanner;

import java.util.Scanner;
public class MethodCalls {
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));
    }

    public static int addDigit(int num1, int num2) {return num1 + num2;}        //Add two numbers

    public static int join(int num1, int num2) {
        double double2 = num2 - num2 % 10, digitsInNum2 = 0;                    //Initialize variables in for loop
        for (digitsInNum2 = 0; double2 >= 1; digitsInNum2++) {double2 /= 10;}   //Calculate power of double 2
        int buildNum = num1 * (int) Math.pow(10, digitsInNum2) + num2;          //Add num1*10^(digitsInNum2) on top of num2
        return buildNum;
    }
}