package Arrays2D;

import java.util.Scanner;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//2D Array of row x col; Find max
*/


public class Array2D6 {
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
        
        System.out.println("Largest values is: " + max(a));
        
        System.out.println("Type a key");
        int key = In.nextInt();
        
        System.out.println("Key found?" + find(a, key));
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
    
    public static int max(int [][] S)
    {
        int row = S.length;
        int col = S[0].length;
        int max = S[0][0];
        for(int i=0; i<row ; i++)
        {
            for(int j=0;j<col; j++)
            {
                if(max < S[i][j])
                    max = S[i][j];
            }
        }
        return max;
    }
    
    
    public static boolean find(int [][] A, int key)
    {
        //find key in the array A; return true if found
        boolean Flag =false;
        for(int i =0; i < A.length ;i++)
        {
            for(int j =0; j<A[0].length ;j++)
            {
                if(A[i][j]==key)
                {
                    Flag = true;
                }
            }
        }
        return Flag;
    }
    
}
