// Gustavo Grinsteins
// CSE 002 - section 310 
// lab11 sort.java
// 11/06/2015

/* Purpose:

    This program creates an array of integers of size 20. Initializes the array
with 20 random numbers between 0 and 100. then this array is sorted from smallest
to biggest. a second array is created but holding 10 numbers. The same process
is reapeated. A third array is created and filled with the numbers of the past
two arrays then sorted and then printed.

    
Learning Outcomes: 

*get practice manipulating arrays


*/


//create a class
public class sort{
    
    //create a main method
    public static void main(String[] args) {
        
        //Array 1
        
        //construct and declare the array of size 20
        int[] array1 = new int[20];
        
        
        System.out.println("Array 1 (no sort)");
        
        //assigning and printing
        
        System.out.print("[ ");
        
        for(int i = 0; i < 20; i++) {
            
            array1[i] = (int)(Math.random()*100);
            
            System.out.print( array1[i] + " ");
            
        }
        
        System.out.println("]");
        
        //call the method to sort
        sort(array1);
        
        System.out.println("Array 1 sort");
        
        //print the array to check
        
        System.out.print("[ ");
        for(int i = 0; i < 20; i++) {
            
            System.out.print(array1[i] + " ");
            
        }
        
        System.out.println("]");
        
        //ARRAY 2
        
        //construct and declare the array of size 10
        int[] array2 = new int[10];
        
        
        System.out.println("Array 2 (no sort)");
        
        //assigning and printing
        
        System.out.print("[ ");
        
        for(int i = 0; i < 10; i++) {
            
            array2[i] = (int)(Math.random()*100);
            
            System.out.print( array2[i] + " ");
            
        }
        
        System.out.println("]");
        
        //call the method to sort
        sort(array2);
        
        System.out.println("Array 2 sort");
        
        //print the array to check
        
        System.out.print("[ ");
        for(int i = 0; i < 10; i++) {
            
            System.out.print(array2[i] + " ");
            
        }
        
        System.out.println("]");
        
        //ARRAY 3
        
         //construct and declare the array of size 30
        int[] array3 = new int[30];
        
        
        System.out.println("Array 3 (no sort)");
        
        //assigning and printing
        
        System.out.print("[ ");
        
        for(int i = 0; i < 20; i++) {
            
            array3[i] = array1[i];
            
            System.out.print( array3[i] + " ");
            
        }
        
        for(int i = 20; i < 30; i++) {
            
            array3[i] = array2[i - 20];
            
            System.out.print( array3[i] + " ");
            
        }
        
        System.out.println("]");
        
        //call the method to sort
        sort(array3);
        
        System.out.println("Array 3 sort");
        
        //print the array to check
        
        System.out.print("[ ");
        for(int i = 0; i < 30; i++) {
            
            System.out.print(array3[i] + " ");
            
        }
        
        System.out.println("]");
        
        
        
    }
    
    //method that sorts the elemets in the array in ascending order
    public static void sort(int[] a){
        
        //this nested for loop will compare each number from 0 to 19 and 
        //to see if the number located at the place is bigger than the other
        //numbers if it is this values are swapped if it is not the loop keeps
        //running
        
        //we will use a variable that will help us sort the array by switching
        //the value stored at one position to another position
        //it works as a momentary storage of the value of the variable
        //so that value is not lost
        
        int val;
        
        for(int i = 0; i < a.length; i++) {
            
            for(int j = i + 1; j < a.length; j++){
                
                if(a[i] > a[j]){
                    
                    //store the bigger number in a variable
                    val = a[i];
                    
                    //make the switch to put the smaller number
                    //where the bigger number was
                    a[i] = a[j];
                    
                    //locate the bigger number where the small number was 
                    //located 
                    a[j] = val;
                    
                }
                
            }
            
            
        }
        
        
    }


        
    }