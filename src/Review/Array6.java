package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Reversing a array
*/


public class Array6 
{
  public static void main(String[] args) 
  {
        String [] myList;
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        // input values
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
        
        //reversing
        myList = reverseArray(myList);
        
        //printing
        printArray(myList);        
        
        
        
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
  
  public static String [] reverseArray(String [] S)
  {
      String [] copy = new String[S.length];
      int j = S.length - 1;
      for (int i = 0; i < S.length; i++) {
            copy[j] = S[i]; 
            j--;
      }
      return copy;
  }
  
}

