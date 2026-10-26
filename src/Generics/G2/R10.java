/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Using Faster Binary Search Algorithm

*/
package Generics.G2;

public class R10 {
    public static void main(String [] args){
        int [] Arr = {1, 2, 3, 5, 7, 8, 9, 11, 12};
        int key = 1;
        
        System.out.println(Bsearch(Arr, key, 0, Arr.length));
        
    }
    
    public static boolean Bsearch(int [] A, int k, int Lo, int Hi){
        if(Lo > Hi) // base case; 
            return false;
        
        int Mid = Lo + (Hi - Lo) / 2;

        if(A[Mid] == k) // base case 2
            return true;
        
        else // recursive case; 
        {
            if(k < A[Mid]) // go left
                return Bsearch(A, k, Lo, Mid - 1);
            else
                return Bsearch(A, k, Mid + 1, Hi);
        }
    }  
}
