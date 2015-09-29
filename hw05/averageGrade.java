// Gustavo Grinsteins
// CSE 002 - section 310 
// hw05 averageGrade.java
// 10/01/2015

/* Purpose:

    This program will let the user enter grades that have the range 0<grade<100
and compute the average of the amount of grades entered. If the grade entered is
not in the desired range the program will let the user know and ask the user to 
enter a valid number. In order to get out of the program the user needs to input
999 this will take the program to calculate the average.

    
Learning Outcomes: 

*practice in writing code that enables the user to input data

*practice in using While loops and if-else statements.

*practice using the Scanner function

*practice being aware of the scope of a variable


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//Create public class
public class averageGrade {
    //Create main method
    public static void main(String[] args) {
        //Scanner construction
        Scanner grade = new Scanner(System.in);
        
        //start a counter for the while loop
        //this count will be used to perform the average calculation
        int count = 0;
            
        //this number will let the user exit out the while loop
        int exitNum = 0;
        
        //this will be the sum total of the gardes
        double totalGrade = 0;
        
        //add an empty line in between the sentences to make the code
        //more readable
        System.out.println();
            
        while (exitNum != 999){
            
            //ask the user for a grade
            System.out.print("Please enter the grade (to exit " +
            "and calculate the average enter 999): ");
        
            //store the data from the user
            double userGrade = grade.nextDouble();
            
            //in case the user inputs a correct value
            if (userGrade >= 0 && userGrade <= 100) {
                
                //define a value that lets the program know that the user
                // inputed a desired number
                double correctGrade = userGrade;
                
                //this will keep track of the count of numbers the user inputs
                //for the avrerage calculation
                count ++;
                
                //this will keep adding the grades of the user together to 
                // perform the average calculation at the end of the program
                totalGrade += correctGrade; 
            
                }
            
            //in case the user enters a value that is not in range and is not
            //equal to 999
            else if (userGrade != 999) {
                
                //add an empty line in between the sentences to make the code
                //more readable
                System.out.println();
                //warn the user he inputed something invalid
                System.out.println("An invalid grade has been entered! " +
                "Please enter a valid grade");
                //add an empty line in between the sentences to make the code
                //more readable
                System.out.println();
            
                }
            
            //in case the user wants to get out of the program and perform
            //the average calculation
            else if (userGrade == 999) {
                
                //this will cause the boolean statement of the while loop to be 
                //false and exit out the while loop
                exitNum = 999;
                
                }
                
            }
        
            //average calculation
            
            //declare the variable where the average is going to be stored
            double averageGrade;
            
            //average formula
            averageGrade = (totalGrade/count);
            
            //add an empty line in between the sentences to make the code
            //more readable
            System.out.println();
            
            //let the user know what the average is
            
            System.out.println("Your average is: " + averageGrade);
            
            //add an empty line in between the sentences to make the code
            //more readable
            System.out.println();
        
                
        }
        
        
    }
