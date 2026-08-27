package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Array declaration and processing; visualization with debugger
*/

public class Array1 
{
  public static void main(String[] args) 
  {
    int[] values = new int[5];
    for (int i = 1; i < 5; i++) 
    {
      values[i] = i + values[i-1];
    }
    values[0] = values[1] + values[4];
    System.out.println(values[0]);
  }
  
}

