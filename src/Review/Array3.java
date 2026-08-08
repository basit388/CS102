package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Array printing and processing
*/

public class Array3 
{
  public static void main(String[] args) 
  {
        String [] myList = new String [5];
        java.util.Scanner input = new java.util.Scanner(System.in);

        // input names
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) 
            myList[i] = input.next();
 
        
        //printing
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println();
        
        //shifting LEFT
        String temp = myList[0];
        for (int i = 0; i < myList.length - 1; i++) {
            myList[i] = myList[i+1];
        }
        myList[myList.length-1] = temp;

        //printing
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        //Do Shift RIGHT
        
        
  }
}

