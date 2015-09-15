// Gustavo Grinsteins
// CSE 002 - section 310 
// HW03 Program # 1
// 09/15/2015
// Timer Java program

/* Purpose:

    This program will let the user know how much time the user has left until
dinner.
    
Learning Outcomes: 

*Make the user input data and use the data to perform calculations
*Practice performing arithmetic operations

*/

// import Scanner
import java.util.Scanner;

//create a class with the smae name as the saved java file
public class Timer
{
    //declare the main method
    public static void main(String[] args) 
    {
        
        //Declare and construct scanner
        Scanner time = new Scanner(System.in);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input the current time in the desired form
        System.out.print("Enter the current time please: ");
        
        
        //Take in the relevant data from the user
        int currentTime = time.nextInt();
        
        //separate the minutes and hours form the inputdata into different 
        // variables to account for the fact that minutes go from 0 - 60 and
        // hours go from 0 - 24
        int currentHours, currentMinutes;
        
        //Store the number of minutes in a separate variable
        currentMinutes = (currentTime % 100);
        
        //Store the number of variable in a separate variable
        //we dont have to use casting here because all the variables are int
        currentHours = (currentTime / 100);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input the current time in the desired form
        System.out.print("Enter The time you will be eating dinner please: ");
        
        //Take in the relevant data from the user
        int dinnerTime = time.nextInt();
        
        //separate the minutes and hours form the inputdata into different 
        // variables to account for the fact that minutes go from 0 - 60 and
        // hours go from 0 - 24
        int dinHours, dinMinutes;
        
        //Store the number of minutes in a separate variable
        dinMinutes = (dinnerTime % 100);
        
        //Store the number of variable in a separate variable
        //we dont have to use casting here because all the variables are int
        dinHours = (dinnerTime / 100);
        
        
        //Calculation of time remaining until dinner:
        int remainingHours, remainingMinutes;
        
        // there are different scenarios that would cause inacurate answers
        // I am implementing if statements to try to fix this scenarios
        
        
        // Scenario # 1 
        // if the user imputs a dinner time that has 0 minutes and a current 
        // time that has non 0 minutes then the calculations need to be altered 
        // in order to get the right answer
        if(dinMinutes == 0 && currentMinutes>dinMinutes ) 
        { 

        // by setting the 0 equal to 60 we can get to the accurate answer
        dinMinutes = 60;
        
        // calculate the remaining minutes   
        remainingMinutes = dinMinutes - currentMinutes;
        
        // calculate the remaining minutes
        remainingHours = dinHours - currentHours;
        
        //we need to subtract 1 from the hours because we added 60 minutes for 
        //the dinner
        remainingHours = remainingHours - 1;
            
            
        }
        
        //Scenario # 2: if the dinner minutes are less than the current minutes 
        // then our answer will be inacurate so we need to account for this
        
        if (dinMinutes<currentMinutes)
        {
            // calculate the remaining hours
            remainingHours = dinHours - currentHours;
            
            // calculate the remaining minutes
            // note that to fix the problem here we need to add 
            // the minutes instead of subtracting
            remainingMinutes = dinMinutes + currentMinutes;
            
            // subtract 1 hour from the hours
            remainingHours = remainingHours - 1;
        }
        
        //for anything else we will perform this calculation
        
        else 
        {
            
            remainingMinutes = dinMinutes - currentMinutes;
        
            remainingHours = dinHours - currentHours;
            
        }
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //print the reaming time the user has.
        // I will use the Math absolute function in java to acount for the 
        //fact that the user might put values for the minutes that will cause
        // a negative number for the minutes
        System.out.println("You have " + remainingHours + " hours and " + Math.abs(remainingMinutes) + 
        " minutes until dinner.");
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();

        }
}