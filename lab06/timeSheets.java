// Gustavo Grinsteins
// CSE 002 - section 310 
// lab06 timeSheets.java
// 10/02/2015

/* Purpose:

    This program will let the user input the amount of timesheets that need to 
be processed. Then the program will ask the user the rate of pay in cents of 
each employee. Before going to the next employee, the program will ask for the
hours of the ith employee per day of the week (monday through friday). After all
the employee info has been entered the program will print the total money for
the pay roll.

    
Learning Outcomes: 

*practice in writing code that enables the user to input data

*practice in using nested loops


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//Create public class
public class timeSheets {
    //Create main method
    public static void main(String[] args) {
        
        //build a scanner for the inputed data
        Scanner input = new Scanner(System.in);
        
        //initialize variable to get out of the while loop
        int out = 0;
        
        //initialize the variable where the number of time sheets will be stored.
        //it is important to initialize this outside the while loop so the
        //rest of the program can use it
        double numTimeSheet = 0;
        
        //enter a non-negative integer specifying the number 
        //of employee timesheets to be read in
        
        while (out ==0){
        
            System.out.print("Enter the number of timesheets to be read: ");
        
            //accept the data from the user
            //note: we dont initialize this inside the while loop
            //in order to use this variable for the for loop later in the code
            numTimeSheet = input.nextDouble();
            
            //stablish condition that will make sure the user doesnt enter a
            //negative value
            if (numTimeSheet < 0) {
                
            System.out.println("Enter a valid number please!");
                
                }
            
            //if the user inputs a true value then we will get out of the
            //while loop
            else {
                    
                out = 1;
                
            }
        
        }
        
        //ask for data for each of the employees
        
        //we will have this variable on the outside of this loop in order to
        //use it outside the loops
        double totalPay = 0;
        
        //start a for loop that will run as many time as timesheets are
        //available
        for (int i = 1; i <= numTimeSheet; i++) {
            
            //initialize the total hours that we will calculate on the
            //nested loop here 
            double totalHours = 0;
            
            System.out.print("Enter Pay per hour (in cents) of employee " + i + ": ");
            
            //recieve data from user
            double payPerHour = input.nextDouble();
            
            //enter the hours worked per day of the week
            
            for (int j = 1; j <= 5; j++){
                
                System.out.print("Enter the number of hours worked on day " + j + ": ");
                
                //recieve input from the user
                double hoursPerDay = input.nextDouble();
                
                //accumulate all the hours worked in one variable
                totalHours += hoursPerDay;
                
            }
            
            //accumulate the total monay we the company will pay for all
            //the employees in one variable
            totalPay += (totalHours*payPerHour);
            
        }
        
        //let the user know how much money she/he needs to pay in total
        
        System.out.println("The total payroll of all employees are: " + 
        totalPay + " Cents");
        
                
    }
        
        
}
