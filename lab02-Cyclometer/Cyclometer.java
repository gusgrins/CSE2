// Gustavo Grinsteins
// CSE 002 - section 310 
// Subject: lab02
// 09/04/2015

// The Cyclometer program

/* Purpose:

    In this program we will emulate a bicycle cyclometer. The program will 
consist of an range of variables that will store time and number of times the 
bicycle wheel turns on each bicycle trip. From these stored variables we will 
calculate the total distance the bicycle travelled on a specific trip and put 
this numbers in diferent variables. There will be another section of variables 
added that will hold useful quantities for unit conversions.

Learning Outcomes: 

*to become familiar with storing variables in Java
*Learn how to do arithmetic calculations with Java
*work on proper coding habits: indenting lines and using comments

*/

//defining the class
public class Cyclometer
{
    
    //main method required for every Java program
    public static void main(String [] args)
    {
    
        //Declaration of variables:
        
        int secsTrip1=480; //amount of seconds for the first trip
        int secsTrip2=3220; //amount of seconds for the second trip
        int countsTrip1=1561; //amount of wheel rotations for the first trip
        int countsTrip2=9037; //amount of wheel rotations for the second trip
        double wheelDiameter=27.0, //The diameter of the bicycle's wheel
        
        // Useful conversion quantities:
        
        PI=3.14159, //declaration of mathematical constant Pi
        feetPerMile=5280, //number of feet in a mile 
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60; //number of seconds in a minute
        
        //Declaration of the variables we will calculate:
        
        double distanceTrip1, distanceTrip2, totalDistance;
        
        //First round of Printing statements:
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts."); /*This will print the amount of minutes and 
        wheel rotations counts the first trip took */
        
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts."); /* This will print the amount of minutes and 
        wheel rotations counts the second trip took */
        
        //Calculation of distances:
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; /*This calculates the 
        distcance of trip 1 in inches by finding the circumference of the 
        bicycle's wheel and multiplying the circumference by the amount of times 
        the wheel turned. this also stores the value in distanceTrip1 */
        
        distanceTrip1/= inchesPerFoot * feetPerMile; /* this Converts the distance 
        from  inches to miles and overwrites the previous distanceTrip1 
        variable */
        
        distanceTrip2= countsTrip2 * wheelDiameter*PI/inchesPerFoot/feetPerMile;
        /* this calculates the distance of trip 2 and also makes the conversion 
        of inches into miles and stores the value in distanceTrip2 */
        
        totalDistance= distanceTrip1 + distanceTrip2; /* this calculates the 
        total distance traveled between the two trips by adding the distances of
        both of trips together. this value is stored in the totalDistance 
        variable*/
        
        //Second round of printing statements:
         
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); /*this prints
        the distance of trip 1 */
        
        
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); /*this prints
        the distance of trip 2*/
        
        System.out.println("The total distance was "+totalDistance+" miles"); 
        /* this prints the total distnace traveled */
        
    } //end of main method
} //end of class
