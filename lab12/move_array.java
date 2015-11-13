// Gustavo Grinsteins
// CSE 002 - section 310 
// lab12 move_array.java
// 11/17/2015

/* Purpose:

    This program will move the value at a specific index to the end of an array.


    
Learning Outcomes: 

*getting use to writing loops and using try/catch statements


*/
//import the scanner class since we are requesting info from user
import java.util.Scanner;

//creating class
public class move_array {
    
    //create main class
    public static void main(String[] args){
        
        //create the scanner class
        Scanner input = new Scanner(System.in);
        
        //initialize value for first while loop so it runs
        boolean getOut1 = true;
        
        //initialize value for second while loop so it runs
        boolean getOut2 = true;
        
        //this while loop will run the code again when the user inputs
        //something not valid
        while(getOut1){
        
        //Implement a try/catch statement to help the user in case a negative
        //value is entered
        try {
            
            //ask the user for the size of the array
            System.out.print("Please Specify the size of the array: ");
        
            //obtain the information from the user
            int arrSize = input.nextInt();
            
            int[] moveArr = new int[arrSize];
            
            System.out.println("Original Array");
            
            System.out.print("[ ");
        
        //Fill the array with random values from 0 to 100
        //and print the array so we can see what values we have
        //and to check if the code is correct
        for(int i = 0; i < moveArr.length; i++){
            
            moveArr[i] = (int)(Math.random()*100);
            
            System.out.print(moveArr[i] + " ");
            
        }
        
        System.out.println("]");
        
        //change the value so the while loop does not run anymore
        getOut1 = false;
            
            //this while loop will run the code again when the user inputs
            //something not valid
            while(getOut2){
                
            try{
                
                System.out.print("Please enter the value's index you want to move to the end : ");
        
                int index = input.nextInt();
                
                //store the value at index in a temporary variable
                int temp = moveArr[index];
                
                
                for(int i = index; i < moveArr.length; i ++){
                    
                    //we dont want the for loop to go out of index so
                    //we will shift the values until we get to last index
                    //in the matrix
                    if(i != (moveArr.length - 1)){
                    
                    moveArr[i] = moveArr[i+1];
                    
                    }
                    
                    //when we are at the last index in the matrix we will 
                    //store the value the user specified to put at the end at
                    //the last index value of the matrix. The loop will exit here
                    //since we are at the last index
                    else{
                        
                        moveArr[moveArr.length-1] = temp;
                        
                    }
                    
                }
                
                System.out.println("New Array");
                
                System.out.print("[ ");
        
            //This loop will print the new array
            for(int i = 0; i < moveArr.length; i++){
            
            System.out.print(moveArr[i] + " ");
            
            }
            
            System.out.println("]");
            
            //change the value so the while loop does not run anymore
            getOut2 = false;
                
            
            }
            
            //if the user eneters an invalid index the code will let the user know
            catch(Exception e){
                
                System.out.println("Please Enter a valid index (0 to " + (moveArr.length - 1) + ")");
                
                
            }
            
            }
            
        }
        
        //if the user inputs a negative value for the size of the array
        //this exception will let the user know
        catch(Exception e){
            
            System.out.println("Please Enter a positive value");
            
            
        }
        
        }
        
        
    //main method bracket    
    }
//class bracket    
}