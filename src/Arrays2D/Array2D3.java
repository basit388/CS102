package Arrays2D;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//2D Array printing
*/


public class Array2D3 {
    public static void main(String [] s)
    {
        //number of rows defined

        int [][] a = new int [3][3];

        a[0][0] = 1;
        a[0][1] = 2;        
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;        
        a[1][2] = 6;

        a[2][0] = 7;
        a[2][1] = 8;        
        a[2][2] = 9;
        
        print(a);
        
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
