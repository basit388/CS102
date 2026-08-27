package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Array declaration and processing
*/

public class Array2 
{
  public static void main(String[] args) 
  {
        double [] myList = new double [5];
        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) 
            myList[i] = input.nextDouble();
/*
        //random    
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
*/
        //printing
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        //summing
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
          total = total + myList[i];
        }
        
        //find max
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) 
              max = myList[i];
        }
        System.out.println("Total: " + total);
        System.out.println("Max:" + max);
    

  }

}

