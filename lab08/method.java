// Gustavo Grinsteins
// CSE 002 - section 310 
// lab08 method.java
// 10/16/2015

/* Purpose:

    This program will make the user input 10 numbers and calculate the mean and
median of this list of numbers.

    
Learning Outcomes: 

*practice writing code that enables the user to input data

*practice using for loops

*practice calling methods in a main statement

*Practice creating main methods 


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//create a class
public class method {
    
    //create a main method
    public static void main(String[] args) {
        
        //build the scanner
        Scanner input = new Scanner(System.in);
        
        //Make the user input 10 numbers
        
        //This value is going to store the value for our target number
        //for the median
        double m1 = 0;
        
        
        //This value is going to store the value for our targer number
        //for the median
        double m2 = 0;
        
        
        //This sum will help us find the mean
        double sum = 0;
        
        //in order to make the user input ten numbers we can use a for loop
        //that runs ten times and takes numbers ten times
        for (int i = 1; i <= 10; i ++) {
            
            System.out.print("Please enter a value = ");
            
            //catch the data
            double userInput = input.nextDouble();
            
            //make sure the add all the values the user inputs
            sum += userInput; 
            
            //if the value is on the n/2 position store it in a variable
            if (i == 5){
                
                m1 = userInput;
                
            }
            
            //if the value is on the (n/2)+1 store it in a variable
            if (i == 6){
                
                m2 = userInput;
                
            }
            
            
        }
        
        
        //System.out.println(sum);
        
        //call the three methods
        
        //this will store the mean in a variable
        double mean1 = mean(sum);

        //this will store the median in a variable
        double median1 = median(m1, m2);
        
        //This method will print the mean and median in a nice statement
        printmethod(mean1, median1);
        
     
        }
        
        //This method will calculate the mean of all the numbers the user
        //inputed
        public static double mean(double x) {
            
            double m = (x/10);
            
            return m;
        
     
        }
        
        //This method calculates the median relative to the numbers the user
        //Inputs
        public static double median(double a, double b) {
             
             double med = (a + b)/(2);
             
             return med;
        
     
        }
        
        //This method prints out the mean and median in a nice sentence
        public static void printmethod(double x, double y) {
             
            System.out.println("The mean of the set of numbers is " +
            x + " and The median of the set is " + y );
        
     
        }


        
    }
    
    
    
