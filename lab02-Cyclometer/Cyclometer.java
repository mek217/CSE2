////////////////////////////////////////////////////////////////////////
//Matthew Koh
//Lab 02
//Cyclometer Java Program
//
//  print the number of minutes for each trip
//  print the number of counts for each trip
//  print the distance of each trip in miles
//  print the distance for the two trips combined

//  define a class
public class Cyclometer{
    
    //add main method
    public static void main(String[] args) {
        
        //our input data
        int secsTrip1=480;      //seconds for trip 1
        int secsTrip2=3220;     //seconds for trip 2
        int countsTrip1=1561;   //rotations for trip 1
        int countsTrip2=9037;   //rotations for trip 2
        
        //intermediate variables & output data
        double wheelDiameter=27.0,  
        PI=3.14159,                 //value of PI
        feetPerMile=5280,           //how many feet in a mile
        inchesPerFoot=12,           //how many inches in a foot
        secondsPerMinute=60;        //how many seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //distance of trip 1 and 2, and total distance
        
        //print numbers
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        //run calculations; store values
        //get distance of each trip in miles
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/= inchesPerFoot*feetPerMile; //gives distance in miles
        //calculate trip 2
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
    }
}