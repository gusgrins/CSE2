// Gustavo Grinsteins
// CSE 002 - section 310 
// lab04 Calculator.java
// 09/18/2015

/* Purpose:

    This program will let the user add, multiply, subtract, or divide nu,numbers
    a and b.
    
Learning Outcomes: 

*Learn how to use the switch statement

*practice using the Scanner function

*get familiar with the compiler errors


*/

// import Scanner
import java.util.Scanner;

//Create public class
public class Calculator
{
    //Create main method
    public static void main(String[] args) 
    {
        //Declare and construct scanner
        Scanner number = new Scanner(System.in);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input a
        System.out.print("Please enter number a : ");
        
        //Take in the relevant data of the user
        double a = number.nextDouble();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input b
        System.out.print("Please enter number b : ");
        
        //Take in the relevant data of the user
        double b = number.nextDouble();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to pick the desired opperation
        System.out.print("Please enter the symbol for the desired opperation" +
        " (+ , -, *, /): ");
        
        //Take in data from the user
        String opperation = number.next();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //creation of switch statement:
        switch(opperation) {
            
            // Let the user perform multiplication
            case "*": 
                
                //print out the multiplication
                System.out.println("a * b = " + (a * b));
                
                //in case this part of the switch statement runs the break 
                // will prevent the switch statement to keep running
                break;
                
            //Case for division
            case "/":
                
                //print division
                System.out.println("a / b = " + (a / b));
                
                //in case this part of the switch statement runs the break 
                // will prevent the switch statement to keep running
                break;
                
            //case for subtraction    
            case "-": 
                
                //print subtraction
                System.out.println("a - b = " + (a - b));
                
                //in case this part of the switch statement runs the break 
                // will prevent the switch statement to keep running
                break;
            
            // case for addition    
            case "+": 
                
                //print addition
                System.out.println("a + b = " + (a + b));
                
                //in case this part of the switch statement runs the break 
                // will prevent the switch statement to keep running
                break;
                
            //set a default case for the scenario where the user inputs 
            //something invalid
            default: 
            
                //let the user know he inputed something invalid
                System.out.println("Error: invalid opperation");
                
                
            }
        
        
        }
}