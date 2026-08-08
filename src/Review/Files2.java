package Review;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//File creation
*/

import java.io.*;

public class Files2 {
    public static void main(String [] s)
    {
        try (
          // Create an input stream for the file
          FileInputStream input = new FileInputStream("temp.txt");
        ) 
        {
          // Read values from the file
          int value;
          while ((value = input.read()) != -1)
            System.out.print(value + " ");
        }
        catch (IOException e) {
          System.out.println("Error reading file.");
          e.printStackTrace();
        }    
  }
}
