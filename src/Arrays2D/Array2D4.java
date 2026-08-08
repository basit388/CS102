package Arrays2D;

import java.util.Scanner;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//2D Array of row x col + printing
*/


public class Array2D4 {
    public static void main(String [] s)
    {
        //number of rows and columns are varied.
        int rows, cols;
        Scanner In = new Scanner(System.in);
        System.out.println("Enter rows: ");
        rows = In.nextInt();
        
        System.out.println("Enter columns: ");
        cols = In.nextInt();
        
        int [][] a = new int [rows][cols];

        randomFill(a);
        
        print(a);
        
    }
    
    public static void randomFill(int [][] S)
    {
        int row = S.length;
        int col = S[0].length;        
        
        for(int i=0; i<row ; i++)
        {
            for(int j=0;j<col; j++)
            {
                S[i][j]= (int)(Math.random()*100);
            }
        }
    }
    
    public static void print(int [][] S)
    {
        int row = S.length;
        int col = S[0].length;
        
        for(int i=0; i<row ; i++)
        {
            for(int j=0;j<col; j++)
            {
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
                    
        }
    }
    
}
