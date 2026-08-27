package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Searching a value in a int array
*/


public class Array7 
{
  public static void main(String[] args) 
  {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        // input values
        System.out.print("Enter size of array :");
        int size = input.nextInt();
        
        int [] myList = makeArray(size);
        // Populate the array with random integers
        for (int i = 0; i < myList.length; i++) 
            myList[i] = (int)(Math.random() * 10);
        
        // input search term
        System.out.print("Enter value to search :");
        int term = input.nextInt();
        
        
        //printing
        printArray(myList);
        System.out.println();
        
        //searching
        boolean result;
        result = search(myList, term);
        
        System.out.println(result);        
        
        
        
  }
  
  public static void printArray(int [] S)
  {
      for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
  }
  
  public static int [] makeArray(int size)
  {
      return new int [size];
  }  
  
  public static boolean search(int [] S, int term)
  {
      boolean Found = false;  
      for (int i = 0; i < S.length; i++) {
            if(S[i] == term) 
            {
              Found = true;
            }
      }
      return Found;
  }
  
}

