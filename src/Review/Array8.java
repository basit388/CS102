package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//CommandLine arguments
*/


public class Array8 
{
  public static void main(String[] args) 
  {
        
        //printing
        printArray(args);
        System.out.println();
        
        
  }
  
  public static void printArray(String [] S)
  {
      for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
  }
  
}

