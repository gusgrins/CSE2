// Gustavo Grinsteins
// CSE 002 - section 310 
// HW03 Program # 1
// 09/15/2015
// Timer Java program

/* Purpose:

    This program will let the user know the volume and surface area of the 
block he has. The program does this by asking him for the length, width, and 
height of the block.
    
Learning Outcomes: 

*Make the user input data and use the data to perform calculations
*Practice performing arithmetic operations in Java 

*/

// import Scanner
import java.util.Scanner;

public class Block
{
    public static void main(String[] args) 
    {
        //Declare and construct scanner
        Scanner dimension = new Scanner(System.in);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input the length of the block
        System.out.print("Enter the length of the block: ");
        
        //Take in the relevant data of the user
        double length = dimension.nextDouble();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input the width of the block
        System.out.print("Enter the width of the block: ");
        
        //Take in the relevant data of the user
        double width = dimension.nextDouble();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Tell the user to input the height of the block
        System.out.print("Enter the height of the block: ");
        
        //Take in the relevant data of the user
        double height = dimension.nextDouble();
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Calculate the volume of the block
        //Declare the type of variable of the volume
        double volume;
        
        //volume of the block
        volume = length * width * height;
        
        //Print the volume for the user
        System.out.println("The Volume of the block of dimensions " + 
        length + " X " + width + " X " + height + " is " + volume);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        //Calculate the surface are of the block
        //Declare the type of variable for the surface area
        double surfaceArea;
        
        //Calculation of the surface area of the block
        surfaceArea = 2 * (width * length + height * length + height * width);
        
        //Print the surface area for the user for the user
        System.out.println("The surface area of the block is " 
        + surfaceArea);
        
        //add a space between the lines so the code is more visually appealing
        System.out.println();
        
        }
}