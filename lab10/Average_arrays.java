// Gustavo Grinsteins
// CSE 002 - section 310 
// lab10 Average(arrays).java
// 10/30/2015

/* Purpose:

    This program will ask the user to input the number of values that will
be stored in the array. The program will create an array with that number of 
values. Ater this random numbers will be stored in the array in thos specified spaces. 
These values will then be printed. The sum of these values will be calculated 
to find the average. Finally all the values greatar than or equal to the average
will be printed.

    
Learning Outcomes: 

*get practice manipulating arrays


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//create a class
public class Average_arrays{
    
    //create a main method
    public static void main(String[] args) {
        
        //build the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for his input
        System.out.print("enter the number of values in the array: ");
        
        //store the input in a variable
        int n = input.nextInt();
        
        
        //declaring and constructing the array
        int[] numbers = new int[n];
        
        System.out.println("Values in the array");
        
        //assigning and printing for loop
        for(int i = 0; i < n; i++) {
            
            numbers[i] = (int)(Math.random()*100);
            
            System.out.println("int[" + i + "] = " + numbers[i]);
            
        }
        
        
        
        //initializing the sum
        int sum = 0;
        
        //Summing for loop
        for(int i = 0; i < n; i++) {
            
            sum += numbers[i];
            
        }
        
        //store the average in a variable
        int average = (sum)/(n);
        
        System.out.println("The average is about = " + average);
        
        System.out.println("Values greater than or equal to the average");
        
        //print values greater than  or equal to the average
        for(int i = 0; i < n; i++) {
            
            if(numbers[i] >= average){
                
                System.out.println("int[" + i + "] = " + numbers[i]);
                
            }
            
        }
        
        
        
    }


        
    }