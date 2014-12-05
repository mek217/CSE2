////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//12/4/14
//Lab12
//Array Arithmetic
//
/*
This program calls two methods htat are among a number that could be written 
to perform arithhmetic operations on arrays.

Write the code for equals() and addArrays(). 

Method equals():
    Take two arrays of doubles as input and return true iff the two arrays are 
    of the same length and have the same values in the same locations.
    
Method addArrays():
    Take two arrays of doubles as input and return a new array of doubles whose 
    entries are the sum of the entries at the corresponding indices of the 
    input arrays (result[2] = array1[2] + array2[2]).
    
    If the two arrays are of different length, then your method should assume 
    that 0's are implied at the end of the shorter array.
*/

public class ArrayMath{
    
    public static void main(String [] arg){
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
        y[] = {2.3, 3, 4, -2.1, 82, 23},
        z[] = {2.3, 13, 14},
        w[] = {2.3, 13, 14, 12},
        v[] = {},
        u[] = {2.3, 12, 14};
        System.out.println(display(x)+" \n + " + display(y)+ "\n = " +display(addArrays(x,y)));
        System.out.println(display(x)+" \n + " + display(z)+ "\n = " +display(addArrays(x,z)));
        System.out.println("It is "+equals(x,y)+" that "+display(x)+" == "+display(y));
        System.out.println("It is "+equals(z,w)+" that "+display(z)+" == "+display(w));
        System.out.println("It is "+equals(u,z)+" that "+display(u)+" == "+display(z));
    }
    
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=x[j];
        }
        return out+"}";
    }
    
    public static boolean equals(double[] array1, double[] array2){                   
        boolean tester = true;                                                  
        if(array1.length == array2.length){                                 //Continue if array lengths are equal
            for(int i=0; i<array1.length; i++){                                 //Compare every element in arrays 1 and 2
                if(array1[i] != array2[i]){return tester = false;}              //Return false if elements are not equal
            }                                                                   
        }                                                                       
        else{tester = false;}                                                   //Return false if array lengths are not equal
        return tester;                                                          //Last return
    }
    
    public static double[] addArrays(double[] array1, double[] array2){
        if(array1.length <= array2.length){                                 //If 2 is bigger, then switch 1 and 2, then continue
            double[] temp = array1;                                                //Now, array1 is either larger or equal (setwise) to array2
            array2 = array1;
            array1 = temp;
        }
        
        double[] output = new double[array1.length];
        
        for(int i=0;i<array2.length;i++){                                     //Combine elements until array2 limit reached
            output[i]=array1[i]+array2[i];
        }
        
        for(int j=array2.length;j<array1.length;j++){                       //Rest of elements in output = array1
            output[j]=array1[j];
        }
        return output;
    }
    
}