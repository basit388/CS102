/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program findSum
*/
package Generics.G2;

public class R4 {
    public static void main(String [] args){
        
        int f = findSum(5);
        System.out.println(f);
        
    }
    
    public static int findSum(int i){
        if(i==0) // base case; 
            return 0;
        else // recursive case; 
        {
            return i + findSum(i-1); 
        }
    }  
}

/*
Recursion TREE
findSum(5)          return 15
     |                ^
     \/               |
5 + findSum(4)     = 5 + 10= 15
     |                   ^
     \/                  |
4 + findSum(3)     = 4 + 6 = 10
     |                   ^
     \/                  |
3 + findSum(2)     = 3 + 3 = 6
     |                   ^
     \/                  |
2 + findSum(1)     = 2 + 1 = 3     
     |                   ^
     \/                  |
1 + findSum(0)     = 1 + 0 = 1
     |                   ^
     \/                  0
Base case:               ^
STOP return 0 -----------|


*/
