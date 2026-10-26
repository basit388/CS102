/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program findSum
*/
package Generics.G2;

public class R5 {
    public static void main(String [] args){
        
        int f = factorial(5);
        System.out.println(f);
        
    }
    
    public static int factorial(int i){
        if(i==1) // base case; 
            return 1;
        else // recursive case; 
        {
            return i * factorial(i-1); 
        }
    }  
}

/*
Recursion TREE
factorial(5)          return 120
     |                     ^
     \/                    |
5 * factorial(4)     = 5 * 24= 120
     |                     ^
     \/                    |
4 * factorial(3)     = 4 * 6 = 24
     |                     ^
     \/                    |
3 * factorial(2)     = 3 * 2 = 6
     |                     ^
     \/                    |
2 * factorial(1)     = 2 * 1 = 2     
     |                     ^
     \/                    1
Base case:                 ^
STOP return 1 -------------|


*/
