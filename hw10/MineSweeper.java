// Gustavo Grinsteins
// CSE 002 - section 310 
// hw10 MineSweeper.java
// 11/12/2015

/* Purpose:

    This program will create the classic game of Mine Sweeper. The first portion
of the program asks the user the size of the game board and the number of mines
in the game. The program then creates a String array with the values that the user
inputs. The number of mines will be distributed randomly on the designated board.
Then the program will add a count of a number that reoresents the number of mines
adjacent to that cell where the number is located.

    
Learning Outcomes: 

*get practice manipulating 2D arrays, strings, nested loops, if statements, and
get good at understanding the logic of the code.


*/

// import Scanner because we will be requiring input from the user
import java.util.Scanner;

//create a class
public class MineSweeper{
    
    //create a main method
    public static void main(String[] args) {
        
        //build the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for the size of the board
        System.out.print("Please enter the size of the board (number between 2 and 30): ");
        
        //store the input in a variable
        int n = input.nextInt();
        
        
        //declaring and constructing the 2D array
        String[][] numbers = new String[n][n];
        
        //ask the user for the number of mines to be placed on the boar
        System.out.print("Please enter the the number of mines to be " +
        "Placed (number between 1 and " + n*n + "): ");
        
        //store the input in a variable
        int M = input.nextInt();
        
        //initialize the null values of the array for a blank space
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            
            //this dot will represent a blank space    
             numbers[i][j] = ".";   
                
            }
            
        }
        
        //Create the Mine Game
        
        //Place the mines a random locations on the board
        int numMines = 0;
        
	    while(numMines < M){
	        
		int x = (int)(Math.random()*n);
		
		int y = (int)(Math.random()*n);
		
		//Check to make sure there is no mine at that spot
		//if there is a mine the loop will run again until
		//a mine-less spot is found
		if(!(numbers[x][y].equals("M"))){
		    
			numbers[x][y] = "M";
			
			numMines += 1;
			
		    }
		    
	    }
	    
	    //for loop to go through the cells and update the number of mines
	    //in adjacent cells
	    //row for loop
        for(int i = 0; i < n; i++){
            
            //column for loop
            for(int j = 0; j < n; j++){
                
                //if there is a mine in that position of the matrix
                //we want to explore the adjacent cells and change them
                if(numbers[i][j].equals("M")){
                        
                        //this for loop is incharge of exploring the adjacent
                        //cells relative to the mine that we encounter using
                        //the last for loop
                        //row loop
                        for(int a = (i-1); a <= (i+1) ; a++){
                            
                            //column loop
                            for(int b = (j-1) ; b <= (j+1); b++){
                                
                                //check to make sure the index is not out
                                //of bounds Then change the number
                                if( a >= 0 && a < n && b >= 0 && b < n ){
                                
                                    //if the cell is filled with a blank
                                    //we will fill it up with one since
                                    //this cell is adjacent to the mine
                                    if(numbers[a][b].equals(".")){
                                    
                                        numbers[a][b] = "1";
                                    
                                    }
                                    
                                    //this if statement will make sure that nothing
                                    //happens when the cell is a mine
                                    else if(numbers[a][b].equals("M")){
                                    
                                    //We will do nothing for this
                                    
                                    }
                                    
                                    //this else statement will increment the size
                                    //of the numbers that represent the number of
                                    //mines adjacent to it
                                    else {
                                        //if the value if not a blank, that means
                                        //that it must be a number so we will
                                        //increment this number by 1 using
                                        //parse int and then concatenating
                                        //this with out String array position
                                        numbers[a][b] = "" + (Integer.parseInt(numbers[a][b]) + 1) ;
                                    
                                    //bracket for else statement
                                    }
                                //bracket for if statement
                                }
                            //bracket for column for loop 
                            }
                        //bracket for row for loop
                        }
                        
                    //bracket for if statement  
                    }
                 //bracket for column for loop 
                }
            //bracket for row for loop    
            }
        
        //print the array so the user is able to see the game
        //row loop
        for(int i = 0; i < n; i++){
            //column loop
            for(int j = 0; j < n; j++){
                
                System.out.print(numbers[i][j] + " ");
                
            }
            
            System.out.println();
            
        }
        
    //Bracket for main    
    }  
//bracket for class    
}
