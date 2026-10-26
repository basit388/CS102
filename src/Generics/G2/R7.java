/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program Sum all values in array
*/
package Generics.G2;

public class R7 {
    public static void main(String [] args){
        int [] Arr = {2, 4, 3, 1};
        
        int sum = sumArr(Arr, 0);
        System.out.println(sum);
        
    }
    
    public static int sumArr(int [] A, int i){
        if(i==A.length) // base case; 
            return 0;
        else // recursive case; 
        {
            return A[i] + sumArr(A, i + 1); 
        }
    }  
}

/*
Recursion TREE
sumArr(A, 0)          return 10
     |                     ^
     \/                    |
2 + sumArr(A, 1)     = 2 + 8= 10
     |                     ^
     \/                    |
4 + sumArr(A, 2)     = 4 + 4 = 8
     |                     ^
     \/                    |
3 + sumArr(A, 3)     = 3 + 1 = 4
     |                     ^
     \/                    |
1 + sumArr(A, 4)     = 1 + 0 = 1     
     |                     ^
     \/                    0
Base case:                 ^
STOP return 0 -------------|


*/
