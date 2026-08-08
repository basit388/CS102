package Arrays2D;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//3D Array declaration and visualization with debugger
*/


public class Array2D8 {
    public static void main(String [] s)
    {
        //number of rows defined
        //number of col not defined
        int [][][] a = new int [3][3][3];
        //page, row, column
        
        //page 0 row 0
        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][0][2] = 3;
        
        //page 0 row 1
        a[0][1][0] = 4;
        a[0][1][1] = 5;
        a[0][1][2] = 6;
                
        //page 0 row 2
        a[0][2][0] = 7;
        a[0][2][1] = 8;
        a[0][2][2] = 9;        

        //page 1 row 0
        a[1][0][0] = 1;
        a[1][0][1] = 2;
        a[1][0][2] = 3;
        
        //page 1 row 1
        a[1][1][0] = 4;
        a[1][1][1] = 5;
        a[1][1][2] = 6;
                
        //page 1 row 2
        a[1][2][0] = 7;
        a[1][2][1] = 8;
        a[1][2][2] = 9;  

        //page 2 row 0
        a[2][0][0] = 1;
        a[2][0][1] = 2;
        a[2][0][2] = 3;
        
        //page 2 row 1
        a[2][1][0] = 4;
        a[2][1][1] = 5;
        a[2][1][2] = 6;
                
        //page 2 row 2
        a[2][2][0] = 7;
        a[2][2][1] = 8;
        a[2][2][2] = 9;   
        
        //Lets print page by page
        print(a[0]);
        print(a[1]);
        print(a[2]);        
        
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
