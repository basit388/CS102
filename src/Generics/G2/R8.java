/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program Sum only the ODD values in array
*/
package Generics.G2;

public class R8 {
    public static void main(String [] args){
        int [] Arr = {2, 8, 6, 4, 7, 9, 1};
        
        int sum = sumArr(Arr, 0);
        System.out.println(sum);
        
    }
    
    public static int sumArr(int [] A, int i){
        if(i==A.length) // base case; 
            return 0;
        else // recursive case; 
        {
            if(A[i] %2 == 1) // check if odd
                return A[i] + sumArr(A, i + 1);
            else
                return sumArr(A, i + 1);
        }
    }  
}

