// Gustavo Grinsteins
// CSE 002 - section 310 
// lab09 coinFlip.java
// 10/23/2015

/* Purpose:

    This program will have overloaded methods that will create a random digit
that will be designated to a value for heads or tails. This random number will
be created depending on what the user inputs

    
Learning Outcomes: 

*practice writing and overloading methods


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//create a class
public class coinFlip {
    
    //create a main method
    public static void main(String[] args) {
        
        //build the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for his input
        System.out.print("enter a value from 0 to 100: ");
        
        //store the input in a variable
        int value = input.nextInt();
        
        //if the user eneters 0 call the first flip method
        if(value == 0) {
            flip();
        }
        
        //if the user enters a value greater than 100 end the program
        else if (value > 100){
            System.exit(0);
        }
        
        //if the user inputs anything else we run the second flip() method
        else {
            flip(value);
        }
       
        }
    
    //write a method that prints heads or tails    
    public static int flip(){
        double random = Math.random();
        if (random <= .50){
            //set heads with an int value of 0
            int heads = 0;
            System.out.println("Heads " + heads);
            //gives method flip the value of heads
            return heads;
        }
        else {
            //set tails with an int value of 1
            int tails = 1;
            System.out.println("Tails " + tails);
            //gives method flip the value of tails
            return tails;
        }
    }
    
    //Second method of flip uses the input from the user
    public static void flip(int n){
        
        //in order to count the amount of heads or tails we start a counter for 
        //both options
        
        int countHead = 0;
        int countTail = 0;
        for(int i = 1; i <= n; i++){
        //store the flip method value inside a variable
        int x = flip();
            //if x is heads then we will add one to the head count
            if (x == 0) {
                countHead += 1;
            }
            //if x is not 0 then we will add one to the tail count
            else {
                countTail += 1;
            }
        }
        
        //Print the required output
        
        System.out.println("Total Number of Heads = " + countHead); 
         
        System.out.println("Total Number of Tails = " + countTail);
        
    }


        
    }