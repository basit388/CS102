package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Array pass by index from a method
*/


public class Array5 
{
  public static void main(String[] args) 
  {
        String [] myList;
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        // input names
        System.out.print("Enter size of array :");
        int size = input.nextInt();
        
        myList = makeArray(size);
        
       // input names
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) 
            myList[i] = input.next();        

        
        //printing
        printArray(myList);
        System.out.println();
        
        //shifting LEFT
        String temp = myList[0];
        for (int i = 0; i < myList.length - 1; i++) {
            myList[i] = myList[i+1];
        }
        myList[myList.length-1] = temp;

        //printing
        printArray(myList);

        //Do Shift RIGHT
        
        
  }
  
  public static void printArray(String [] S)
  {
      for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
  }
  
  public static String [] makeArray(int size)
  {
      return new String [size];
  }  
}

