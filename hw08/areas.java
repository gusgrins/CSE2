// Gustavo Grinsteins
// CSE 002 - section 310 
// hw08 areas.java
// 10/27/2015

/* Purpose:

    This program will request information from a user. The User will be given
the option to enter one of these three geometric shapes: circle, trapezoid, or 
rectangle. From here the program will run several methods to compute the area 
of the shape the user inputed. If the user wants to exit out of the program 
the user needs to input the value of 0.

    
Learning Outcomes: 

*practice in writing code that enables the user to input data

*practice in using if-else statements.

*practice using the Scanner function

*practice using methods and being able to overload them


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//Create public class
public class areas {
    //Create main method
    public static void main(String[] args) {
        
        while(true){
            
        //Scanner construction for shape
        Scanner userInput = new Scanner(System.in);    
        
        //ask the user for input
        System.out.print("Please enter Cirlce, Rectangle, or Trapezoid" +
        " " + "to calculate its area (type anything else to exit out): ");
        
        //capture the data in a string
        String geometry = userInput.nextLine();
        
        //convert all the string to lower case so that the user input
        //is generalized
        geometry = geometry.toLowerCase();
        
        //if the user inputs circle
        if(geometry.equals("circle")){
            
            //ask for the radius
            System.out.print("Please enter the radius of the Circle = ");
            
            //store the radius
            int radius = userInput.nextInt();
            
            //print the area using the method
            System.out.println("The area of the Circle is " + area(radius));
            
        }
        
        //if the user inputs rectangle
        else if(geometry.equals("rectangle")){
            
            //ask for the length
            System.out.print("Please enter the Length of the Rectangle = ");
            
            //store the length
            int length = userInput.nextInt();
            
            //ask for the height
            System.out.print("Please enter the height of the Rectangle = ");
            
            //store the height
            int height = userInput.nextInt();
            
            //print the area using the method
            System.out.println("The area of the Rectangle is = " 
            + area(length, height));
            
        }
        
        //if the user inputs trapezoid
        else if(geometry.equals("trapezoid")){
            
            //ask for base 1 of the trapezoid
            System.out.print("Please enter the base 1 of the Trapezoid = ");
            
            //store base 1
            int base1 = userInput.nextInt();
            
            //ask for base 2 of the trapezoid
            System.out.print("Please enter base 2 of the Trapezoid = ");
            
            //store base 2
            int base2 = userInput.nextInt();
            
            //ask for the height of the trapezoid
            System.out.print("Please enter height of the Trapezoid = ");
            
            //store height
            int height1 = userInput.nextInt();
            
            //print the area using the method
            System.out.println("The area of the Trapezoid is = " 
            + area(base1, base2, height1));
            
        }
        
        //if the user types anything else the program will quit
        else {
            System.exit(0);
        }
        
        }
                
        }
    
    //calculate the area of a circle    
    public static double area(int a) {
        
        double circleA = Math.PI * Math.pow(a,2);
        
        return circleA;
        
    }
    
    //calculate the area of the rectangle    
    public static double area(int a, int b) {
        
        double rectangleA = a * b;
        
        return rectangleA;
        
    }
    
    //calculate the area of the Trapezoid    
    public static double area(int a, int b, int c) {
        
        double trapezoidA = (1.0/2.0) * (a + b) * c;
        
        return trapezoidA;
        
    }
    
    
    }
