////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//9/24/14
//Hw04
//Program CourseNumber
//
//Prompt user to enter a 6 digit integer between 186510 and 201440
//First 4 digits give the year, last 2 digits give the semester
//10=Spring, 20=Summer1, 30=Summer2, 40=Fall.

//Import Scanner
import java.util.Scanner;

//Define class
public class CourseNumber{
    
    //Define main instance
    public static void main(String[] args){
        
        //Declare instance of scanner object
        Scanner myScanner;
        
        //Call scanner constructer
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter an integer giving the course semester
        System.out.print("Enter a 6 digit number giving the course semester- ");
        
        //Validate input: number is an integer
        if (myScanner.hasNextInt()){
            
            //Accept user input
            int sixDigit = myScanner.nextInt();
            
            //Validate input: number is between 186510 and 201440
            if (sixDigit >= 186510 & sixDigit <= 201440){
                
                //Get each digit of the year
                int onesPlace = (int)(sixDigit/100)%10;
                int tensPlace = (int)(sixDigit/1000)%10;
                int hundredsPlace = (int)(sixDigit/10000)%10;
                int thousandsPlace = (int)(sixDigit/100000)%10;
                
                //Make year int
                int courseYear = onesPlace+ 10*tensPlace + 100*hundredsPlace + 1000*thousandsPlace;
                
                //Make semester int
                int semesterNumber = (int)(sixDigit)%100;
                //Make semester string
                String courseSemester;
                
                //Determine the semester
                if (semesterNumber == 10){
                    courseSemester = "Spring";
                }
                else if(semesterNumber == 20){
                    courseSemester = "Summer 1";
                }
                else if(semesterNumber == 30){
                    courseSemester = "Summer 2";
                }
                else if(semesterNumber == 40){
                    courseSemester = "Fall";
                }
                else{
                    System.out.println(semesterNumber+ " is not a legitimate course number");
                    return;
                }
                System.out.println("The course was offered in the " +courseSemester+ " semester of " +courseYear);
            }
            else{
                System.out.println("The number was outside the range [186510,201440]");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
    }
}