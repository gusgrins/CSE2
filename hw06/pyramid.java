// Gustavo Grinsteins
// CSE 002 - section 310 
// HW06 pyramid.java
// 10/06/2015

/* Purpose:

    This progarm will ask the user for the size of the pyramid he wants to
build. This program will use loops to build that pyramid.

    
Learning Outcomes: 

*practice in writing code that enables the user to input data

*practice in using nested loops


*/

//import scanner
import java.util.Scanner;

//define a public class
public class pyramid {
    
    //define a main method
    public static void main(String[] args){
        
        //build the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user what is the pyramid size
        System.out.print("What size pyramid? ");
        
        //take the data from the user
        double pyramidSize = input.nextDouble();
        
        //this variable helps the pattern for the number of stars
        int z = 0;
        
        //row creator: this for loop will be in charge of keeping track of the
        //rows of the pyramid
        for(int i = 1; i <= pyramidSize; i++) {
            
            //space creator: this for loop is in charge of adding the necessary
            //spaces that each row has in relation to the last row
            for(int m = 1; m <= (pyramidSize - i); m++){
                
                System.out.print(" ");
                
            }
            
            //star creator: this loop is in charge of printing all the stars
            //that are needed for the pyramid
            for(int j = 1; j <= (i + z); j++){
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
            //ever new row has one extra star compared to the row before it
            // starting at zero. this is what z keeps track of
            z += 1;
            
        }
        
        
    }
}