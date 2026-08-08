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

public class Files1 {
    public static void main(String [] s)
    {
        try (
          // Create an output stream to the file
          FileOutputStream output = new FileOutputStream("temp.txt");
            ) 
        {
          // Output values to the file
          for (int i = 1; i <= 10; i++)
            output.write(i);
        }
        catch (IOException e) {
          System.out.println("Error writing file.");
          e.printStackTrace();
        }

  }
}
