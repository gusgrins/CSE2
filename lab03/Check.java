// Gustavo Grinsteins
// CSE 002 - section 310 
// Subject: lab03
// 09/11/2015

// The Check program

/* Purpose:

The user of this program had dinner with some friends and they want to split
The check evenly.

    This program will ask the user for the following information:
    
    *Final Check price
    
    *Percentage of tip the group wish to pay
    
    *The number of ways the check will be split
    
With this information the program will determine how much each person in the 
group needs to spend.

Learning Outcomes: 

*Know how to get input from the user and use that data to perform basic 
computations.

*/

//This imports the methods needed for this program
import java.util.Scanner;

//
//deine the class for this program
public class Check
{
    // main method required for every Java program
    public static void main(String[] args) 
    {
        
        //declaration of instance of the Scanner object
        //calling the scanner constructor
        Scanner myScanner = new Scanner( System.in );
        
        //ask user for the price of the check
        System.out.print("Enter the original cost of the check " +
        "in the form xx.xx: ");
        
        //Accept the user input
        double checkCost = myScanner.nextDouble();
        
        //ask the user about the percent tip they want to pay
        System.out.print("Enter the percentage tip that you " +
        "wish to pay as a whole number (in the form xx): " );
        
        //accept the inut of the user
        double tipPercent = myScanner.nextDouble();
        
        //We want to convert the percentage into a decimal value
        tipPercent /= 100; 

        //ask the user how many people went to dinner
        System.out.print("Enter the number of people who went out to dinner: ");
        
        //accept the users input
        int numPeople = myScanner.nextInt();
        
        //Calculations
        
        //declare the total cost as a double type variable
        double totalCost;
        
        //declare the Cost Per Person as a double type variable
        double costPerPerson;
        
        //Get the amount of moeny in integer form for dollars, dimes, and pennies
        int dollars, dimes, pennies;
        
        //calculate total cost by having check cost added with 
        //the percent of the tip
        totalCost = checkCost * (1 + tipPercent);
        
        //calculate the cost per person by dividing the total cost by the number
        //of people that went to dinner
        costPerPerson = totalCost / numPeople;
        
        //the integer of the cost per person will be the amount of dollars
        dollars = (int)costPerPerson;
        
        //this calculation gives the ramainder of the cost per person times 10
        dimes = (int) (costPerPerson * 10) % 10;
        
        //this calculation takes the remaider of the costperperson times 100
        pennies = (int) (costPerPerson * 100) % 10;
        
        //this prints out the variable we calculated above
        System.out.println("Each person in the group owes $" + dollars +
        '.' + dimes + pennies);
    } //end of main method
} //end of class

