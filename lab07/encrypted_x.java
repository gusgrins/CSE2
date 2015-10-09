// Gustavo Grinsteins
// CSE 002 - section 310 
// lab07 encrypted_x.java
// 10/09/2015

/* Purpose:

    This program will hide a secrest message X. This X will be buried in a 
handful of stars.

    
Learning Outcomes: 

*practice in writing code that enables the user to input data

*practice using while loops

*practice in using nested loops with while

*practice using the break statement


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//create a class
public class encrypted_x {
    
    //create a main method
    public static void main(String[] args) {
        
        //build the scanner
        Scanner userInput = new Scanner(System.in);
        
        //ask the user for input
        System.out.print("Please enter an integer between 0 and 100: ");
        
        //store the input inside a variable
        int input = userInput.nextInt();
        
        //Cases to make sure the user inputs a valid number
        
        //case 1: user inputs correct number
        if (input >= 0 && input <= 100){
            
            System.out.println("Good number");
            
            System.out.println();
            
        }
        
        // case 2: user inputs something else than a valid number
        else {
            
            //this statement exits the program
            System.exit(-1);
            
        }
        
        //initialize the line variable
        int i = 0;
        
        //line printing loop
        while(i < input) {
            
            //initialize the star variable
            int j = 0;
            
            //star printing loop
            while(j < input){
                
                //check cases to make sure we print a blank where a star is not 
                //needed
                
                
                //case 1: print a " " following the simetry of the encrypted X
                if(i == j || (input - (i+1)) == j){
                    
                    System.out.print(" ");
                    
                }
                
                //Case 2: print a "*" anywhere else where there is no " "
                else {
                    
                    System.out.print("*");
                
                }
                
                //increment the row variable
                j += 1;
            }
            
            //create new line
            System.out.println();
            
            //increment the line variable
            i += 1;
        }
        
    }
    
    
    
}
