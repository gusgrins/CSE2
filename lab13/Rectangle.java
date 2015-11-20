// Gustavo Grinsteins
// CSE 002 - section 310 
// lab13 Rectangle.java
// 11/20/2015

/* Purpose:

    This program will use basic knowledge of classes to find the area of a 
rectangle. This program creates an object r1 that is inside the class Rectangle.
This object is given the parameters width and height by using non static methods
that take in a value of type double and asign that number as the height or
width of the object. A third non-static method in the code computes the area of
the rectangle according to the assigned values of the object. The program prints
the value of the area and ends.


Learning Outcomes: 

*learn how to use non-static methods


*/

//create the class rectangle
public class Rectangle {
    
    //initialize the "global" variable
    double width;
    
    //initialize the "global" variable
    double height;
    
    //create a non static method that sets the value of width of an object
    public void setWidth(double x) {
        
        width = x;
        
    }
    
    //create a non static method that sets the value of Height of an object
    public void setHeight(double x) {
        
        height = x;
        
    }
    
    //create a non static method that computes the area of the object inside
    //the rectagle class
    public double getArea(){
        
        return height*width;
        
    }
    
    //main method where the object r1 is constructed, declared, and initialized.
    //inside the method the area of the resulting object r1 is printied to the 
    //console
    public static void main(String [] args) {
        
        //construct and declare r1 of type rectangle
        Rectangle r1 = new Rectangle();
        
        //set the height of object r1 as 4.4
        r1.setHeight(4.4);
        
        //set the width of object r1 as 5.5
        r1.setWidth(5.5);
        
        //print in the console the value of the area of object r1 
        System.out.println(r1.getArea());
        
    }
    
    
}