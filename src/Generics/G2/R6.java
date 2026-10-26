/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program Search for a key in array
*/
package Generics.G2;

public class R6 {
    public static void main(String [] args){
        int [] Arr = {2, 8, 6, 4, 7, 9, 1};
        int key = 1;
        
        boolean b = search(Arr, key, 0);
        System.out.println(b);
        
    }
    
    public static boolean search(int [] A, int k, int i){
        if(i==A.length) // base case; 
            return false;
        else // recursive case; 
        {
            if(A[i]==k)
                return true;
            return search(A, k, i + 1); 
        }
    }  
}

