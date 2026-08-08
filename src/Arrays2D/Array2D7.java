package Arrays2D;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Ragged/Jagged 2D Array declaration and visualization with debugger
*/


public class Array2D7 {
    public static void main(String [] s)
    {
        //number of rows defined
        //number of col not defined
        int [][] a = new int [3][];
        
        //for each row, define a different column size
        a[0] = new int [4];
        a[1] = new int [3];
        a[2] = new int [2];

        
        a[0][0] = 1;
        a[0][1] = 2;        
        a[0][2] = 3;
        a[0][3] = 4;
        
        a[1][0] = 5;
        a[1][1] = 6;        
        a[1][2] = 7;

        a[2][0] = 8;
        a[2][1] = 9;        
        
        System.out.println(a[0][0] + " " +a[0][1] + " "+a[0][2]+ " "+a[0][3]);
        System.out.println(a[1][0] + " " +a[1][1] + " "+a[1][2]);
        System.out.println(a[2][0] + " " +a[2][1]);
        
        
    }
    
}
